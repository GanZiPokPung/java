package Chapter3;

//enum SmallDistanceUnit {
//	
//	CENTIMETER,
//	INCH;
//	
//	double getConversionRate(SmallDistanceUnit unit) {
//		if(this == unit) {
//			return 1; // 동등 변환률
//		}
//		
//		if(this == CENTIMETER && unit == INCH) {
//			return 0.393701; // 1센티미터당 인치
//		} else {
//			return 2.54;
//		}
//	}
//}

enum SmallDistanceUnit {
	
	CENTIMETER,
	INCH;
	
	static final double INCH_IN_CENTIMETER = 2.54;
	static final double CENTIMETER_IN_INCH = 1 / INCH_IN_CENTIMETER;
	static final int IDENTITY = 1;
	
	double getConversionRate(SmallDistanceUnit unit) {
		if(this == unit) {
			return IDENTITY; 
		}
		
		if(this == CENTIMETER && unit == INCH) {
			return CENTIMETER_IN_INCH; 
		} else {
			return INCH_IN_CENTIMETER;
		}
	}
}