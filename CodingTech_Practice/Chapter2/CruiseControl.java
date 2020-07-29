package Chapter2;

import java.util.Objects;

// 매직 넘버를 상수로 대체
//class CruiseControl {
//	
//	private double targetSpeedKmh;
//	
//	void setPreset(int speedPreset) {
//		if(speedPreset == 2) {
//			setTargetSpeedKmh(16944);
//		} else if (speedPreset == 1) {
//			setTargetSpeedKmh(7667);
//		} else if (speedPreset == 0) {
//			setTargetSpeedKmh(0);
//		}
//	}
//	
//	void setTargetSpeedKmh(double speed) {
//		targetSpeedKmh = speed;
//	}
//}

//class CruiseControl {
//
//	static final int STOP_PRESET = 0;
//	static final int PLANETARY_SPEED_PRESET = 1;
//	static final int CRUISE_SPEED_PRESET = 2;
//	
//	static final double CRUISE_SPEED_KMH = 16944;
//	static final double PLANETARY_SPEED_KMH = 7667;
//	static final double STOP_SPEED_KMH = 0;
//	
//	private double targetSpeedKmh;
//
//	void setPreset(int speedPreset) {
//		if (speedPreset == CRUISE_SPEED_PRESET) {
//			setTargetSpeedKmh(CRUISE_SPEED_KMH);
//		} else if (speedPreset == PLANETARY_SPEED_PRESET) {
//			setTargetSpeedKmh(PLANETARY_SPEED_KMH);
//		} else if (speedPreset == STOP_PRESET) {
//			setTargetSpeedKmh(STOP_SPEED_KMH);
//		}
//	}
//
//	void setTargetSpeedKmh(double speed) {
//		targetSpeedKmh = speed;
//	}
//}

// 정수 상수 대신 열거형
class CruiseControl {

	private double targetSpeedKmh;

	void setPreset(SpeedPreset speedPreset) {
		Objects.requireNonNull(speedPreset);
		
		setTargetSpeedKmh(speedPreset.speedKmh);		
	}

	void setTargetSpeedKmh(double speed) {
		targetSpeedKmh = speed;
	}
}

enum SpeedPreset {
	STOP(0), PLANETARY_SPEED(7667), CRUISE_SPEED(16944);
	
	final double speedKmh;
	
	SpeedPreset(double speedKmh) {
		this.speedKmh = speedKmh;
	}
}


