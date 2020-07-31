package Chapter3;

//class Inventory {
//	// 필드(하나만 있음)
//	List<Supply> supplies = new ArrayList<>();  // 제품 리스트
//	
//	// 메서드
//	int countContaminatedSupplies() {
//		// TODO : 필드가 이미 초기화되었는지(널이 아닌지) 검증한다.
//		
//		int contaminatedCounter = 0; // 카운터
//		// 제품이 없으면 변질도 없다는 뜻
//		for(Supply supply : supplies) { // For 시작
//			if(supply.isContaminated()) {
//				contaminatedCounter++; // 카운터를 증가시킨다.
//			} // 제품이 변질되었으면 IF 끝
//		} // FOR 끝
//		
//		// 변질된 제품 개수를 반환한다.
//		return contaminatedCounter; //유의해 처리한다!
//	}
//} // Invectory 클래스 끝

class Inventory {
	
	List<Supply> supplies = new ArrayList<>();
	
	int countContaminatedSupplies() {
		if(supplies == null || supplies.isEmpty()) {
			// 제품이 없으면 오염도 없다는 뜻이다.
			return 0;
		}
		
		int contaminatedCounter = 0;
		for(Supply supply : supplies) {
			if(supply.isContaminated()) {
				contaminatedCounter++;
			}
		}
		
		return contaminatedCounter;
	}
}