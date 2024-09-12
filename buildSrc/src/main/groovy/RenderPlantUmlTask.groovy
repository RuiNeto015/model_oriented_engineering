/*
 * This code is based on Jason Dunkelberger (a.k.a dirkraft) as stated below
*/

/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Jason Dunkelberger (a.k.a dirkraft)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

// For plantuml support
import net.sourceforge.plantuml.FileFormat
import net.sourceforge.plantuml.FileFormatOption
import net.sourceforge.plantuml.SourceStringReader
import org.apache.commons.io.FilenameUtils
// For gradle
import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.Delete
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.OutputFiles
import org.gradle.api.tasks.incremental.IncrementalTaskInputs
import org.gradle.api.file.FileCollection
import org.gradle.api.file.FileTree
// For File
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import groovy.io.FileType

/**
 *
 */
class RenderPlantUmlTask extends DefaultTask {
  // @InputDirectory
  // def File InputDir
  @InputFiles
  def FileTree inputFiles

  @OutputFiles
  def FileTree outputFiles

//  @InputDirectory
  def File InputDir
//
//  @OutputDirectory
  def File outputDir

  def Path assetsPathInput //= project.projectDir.toPath().resolve('src/main/puml/')
  def Path assetsPathOutput //= project.projectDir.toPath().resolve('build/docs/javadoc/')


    File getDestination(File puml, String extension) {
        // eg: puml = /workspaces/project/src/main/java/csheets/application_start_image1.puml
        String baseName = FilenameUtils.getBaseName(puml.name)    // eg: application_start_image1
        String destName = "${baseName}"
        String basePath = FilenameUtils.getFullPath(puml.path)    // eg: /workspaces/project/src/main/java/csheets/
        //println "basePath="+basePath

        String assetsPathInputString=assetsPathInput.toString()
        //println "assetsPathInput="+assetsPathInputString

        String assetsPathOutputString=assetsPathOutput.toString()
        //println "assetsPathOutput="+assetsPathOutputString

        String relativePath=basePath.substring(assetsPathInputString.length())
        //println "relativePath=${relativePath}"

        String newRelativePathString = relativePath + destName + extension
        //println "newRelativePathString="+newRelativePathString

        String newAbsolutePathString = assetsPathOutputString+newRelativePathString
        //println "newAbsolutePathString="+newAbsolutePathString

        Path destPathPng=Paths.get(newAbsolutePathString)

        destPathPng.toFile()
    }

    String getDirectory(File file) {
        FilenameUtils.getFullPath(file.path)
    }

    String getDestinationFileName(File inputFile, String extension) {
      // eg: puml = /workspaces/project/src/main/java/csheets/application_start_image1.puml
      String baseName = FilenameUtils.getBaseName(inputFile.name)    // eg: application_start_image1
      //String basePath = FilenameUtils.getFullPath(inputFile.path)    // eg: /workspaces/project/src/main/java/csheets/
      String destinationFileName=baseName+extension
    }

    @TaskAction
    void execute(IncrementalTaskInputs inputs) {
      //----
      // Set global Paths
     assetsPathInput = inputDir.toPath()
     assetsPathOutput = outputDir.toPath()

      //----
      println inputs.incremental ? 'CHANGED inputs considered out of date'
                            : 'ALL inputs considered out of date'
      if (!inputs.incremental) {
        // Nothing to do... just proceed into inputs.outOfDate...
      }

      inputs.outOfDate { change ->
          println "out of date: ${change.file.name} / ${change.file.path}"

          if (change.file.isFile()) renderOne(change.file)
        }

      inputs.removed { change ->
          println "removed: ${change.file.name} / ${change.file.path}"

          if (change.file.isFile()) deleteOne(change.file)
        }
    }

    def deleteOne(File input) {
      Path projectPath = project.projectDir.toPath()

      File puml = input

      File png=getDestination(puml, '.png')
      png.delete();
    }

    def renderOne(File input) {
      Path projectPath = project.projectDir.toPath()

      File puml = input
      //File png = outputs.files[i]
      File png=getDestination(puml, '.png')

      String relPumlPath = projectPath.relativize(puml.toPath()).toString()
      String pumlContent = new String(Files.readAllBytes(puml.toPath()), 'UTF-8')

      // Now, generate the file
      SourceStringReader reader = new SourceStringReader(pumlContent)

      // IMPORTANT:
      // It is necessary to create the directory if it does not existe yet!
      if (!png.exists())
      {
        def dir=getDirectory(png)
        // println "Directory=${dir}"
        def subdir = new File(dir)
        subdir.mkdirs()
      }

      //println "Rendering ${relPumlPath} to ${projectPath.relativize(png.toPath()).toString()}"
      FileOutputStream outFile=new FileOutputStream(png)
      reader.generateImage(outFile, new FileFormatOption(FileFormat.PNG))
      outFile.close();
    }
}
