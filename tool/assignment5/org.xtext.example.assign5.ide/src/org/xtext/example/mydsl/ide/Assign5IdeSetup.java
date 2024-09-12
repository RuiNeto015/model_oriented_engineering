/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl.Assign5RuntimeModule;
import org.xtext.example.mydsl.Assign5StandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class Assign5IdeSetup extends Assign5StandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new Assign5RuntimeModule(), new Assign5IdeModule()));
	}
	
}