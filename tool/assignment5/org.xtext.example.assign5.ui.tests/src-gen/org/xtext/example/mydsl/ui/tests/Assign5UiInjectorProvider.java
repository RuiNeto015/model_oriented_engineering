/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.assign5.ui.internal.Assign5Activator;

public class Assign5UiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return Assign5Activator.getInstance().getInjector("org.xtext.example.mydsl.Assign5");
	}

}