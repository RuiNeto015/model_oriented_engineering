/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class Assign5StandaloneSetup extends Assign5StandaloneSetupGenerated {

	public static void doSetup() {
		new Assign5StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}