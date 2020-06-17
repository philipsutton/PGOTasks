package test2;

public interface DrvingAndStopping {
	
	
	boolean isDriving=false;

		public static void drive(boolean isDriving) {
			isDriving=true;
			System.out.println("Train is driving");
		}
		
		public static void stop(boolean isDriving) {
			isDriving=false;
			System.out.println("Train is stopping");
		}
	}


