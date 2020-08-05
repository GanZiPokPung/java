package Chapter4;

//class Rover {
//	
//	static final double WalkingSpeed = 3;
//	
//	final String SerialNumber;
//	double MilesPerHour;
//	
//	Rover(String NewSerialNumber) {
//		SerialNumber = NewSerialNumber;
//	}
//	
//	void Drive() {
//		MilesPerHour = WalkingSpeed;
//	}
//	void Stop() {
//		MilesPerHour = 0;
//	}
//}

class Rover {
	
	static final double WALKING_SPEED = 3;
	
	final String serialNumber;
	double milesPerHour;
	
	Rover(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	void drive() {
		milesPerHour = WALKING_SPEED;
	}
	void stop() {
		milesPerHour = 0;
	}
}
