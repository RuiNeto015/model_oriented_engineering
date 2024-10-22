/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.example.assign4.ui.internal.Assign4Activator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class Assign4ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(Assign4Activator.class);
	}
	
	@Override
	protected Injector getInjector() {
		Assign4Activator activator = Assign4Activator.getInstance();
		return activator != null ? activator.getInjector(Assign4Activator.ORG_XTEXT_EXAMPLE_MYDSL_ASSIGN4) : null;
	}

}
