/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.example.assign5.ui.internal.Assign5Activator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class Assign5ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(Assign5Activator.class);
	}
	
	@Override
	protected Injector getInjector() {
		Assign5Activator activator = Assign5Activator.getInstance();
		return activator != null ? activator.getInjector(Assign5Activator.ORG_XTEXT_EXAMPLE_MYDSL_ASSIGN5) : null;
	}

}
