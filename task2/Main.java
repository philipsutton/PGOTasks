package task2;

public class Main {

	public static void main(String[] args) {
		Airplane plane1 = new Airplane("737", 200);
		Engine engine1 = new Engine (20001, 1999);
				
		plane1.displayAirplaneInfo("737", 200);
		engine1.displayEngineInfo(20001, 1999);
		engine1.checkEngine(20001, 1999);
	}

}
