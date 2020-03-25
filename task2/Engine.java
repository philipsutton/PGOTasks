package task2;

public class Engine {
	
	int engineProductionYear;
	int enginePower;
	
	public Engine(int engineProductionYear, int enginePower)
	{
		this.engineProductionYear = engineProductionYear;
		this.enginePower = enginePower;
	}
	
	
	public void displayEngineInfo(int engineProductionYear, int enginePower)
	{
		System.out.println("Engine production year: " + this.engineProductionYear + " Engine power: " + this.enginePower);
	}
	
	public void checkEngine(int enginePower, int engineProductionYear)
	{
		if (enginePower>20000 && engineProductionYear>2000)
			System.out.println("Engine is ecological");
		else
			System.out.println("Engine isn't ecological");
	}

}
