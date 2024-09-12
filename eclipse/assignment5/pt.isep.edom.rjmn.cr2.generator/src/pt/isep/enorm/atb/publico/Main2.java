package pt.isep.enorm.atb.publico;

public class Main2 extends Main {
	
	public static void main(String[] args) {
		SFactoryMain.setSFactoryImpl(new SFactoryAlternativeImpl());
		//SFactoryMain.getSFactory();
		
		MainMenu.executeMenu();
	}
}
