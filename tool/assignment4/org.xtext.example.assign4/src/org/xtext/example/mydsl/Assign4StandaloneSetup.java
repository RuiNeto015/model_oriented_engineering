/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class Assign4StandaloneSetup extends Assign4StandaloneSetupGenerated {

	public static void doSetup() {
		new Assign4StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}