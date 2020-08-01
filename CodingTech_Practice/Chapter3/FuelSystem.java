package Chapter3;

import java.util.List;

//class FuelSystem {
//	
//	List<Double> tanks = new ArrayList<>();
//	
//	int getAverageTankFillingPercent() {
//		double sum = 0;
//		for(double tankFilling : tanks) {
//			sum += tankFilling;
//		}
//		
//		double averageFuel = sum / tanks.size();
//		// 정수 백분율로 반올림
//		return Math.toIntExact(Math.round(averageFuel * 100));
//	}
//}

//int roundedToPercent = Math.toIntExact(Math.round(averageFuel * 100));
//return roundedToPercent;

class FuelSystem {
	
	List<Double> tanks = new ArrayList<>();
	
	int getAverageTankFillingPercent() {
		double sum = 0;
		for(double tankFilling : tanks) {
			sum += tankFilling;
		}
		double averageFuel = sum / tanks.size();
		return roundToIntegerPercent(averageFuel);
	}
	
	static int roundToIntegerPercent(double value) {
		return Math.toIntExact(Math.round(value * 100));
	}
}