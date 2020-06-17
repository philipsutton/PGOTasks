package test2;

public interface EngineStartStop  {

	public static void engineStart(boolean isEngineOn) throws EngineRunningException{
		
		if (isEngineOn=true) {
		throw new EngineRunningException();
		}
	}
	
	public static void engineStop(boolean isEngineOn) {
		isEngineOn=false;
		
	}
}
