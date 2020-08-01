package Chapter3;

import java.util.Collections;

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

//class Inventory {
//	
//	List<Supply> supplies = new ArrayList<>();
//	
//	int countContaminatedSupplies() {
//		if(supplies == null || supplies.isEmpty()) {
//			// 제품이 없으면 오염도 없다는 뜻이다.
//			return 0;
//		}
//		
//		int contaminatedCounter = 0;
//		for(Supply supply : supplies) {
//			if(supply.isContaminated()) {
//				contaminatedCounter++;
//			}
//		}
//		
//		return contaminatedCounter;
//	}
//}

//class Inventory {
//	
//	private List<Supply> list = new ArrayList<>();
//	
//	void add(Supply supply) {
//		list.add(supply);
//		Collections.sort(list);
//	}
//	
//	boolean isInStack(String name) {
//		// 빠른 구현
//		return Collections.binarySearch(list, new Supply(name)) != -1;
//	}
//}

class Inventory {
	// 리스트를 정렬된 채로 유지한다. isInStack()을 참고한다.
	private List<Supply> list = new ArrayList<>();
	
	void add(Supply supply) {
		list.add(supply);
		Collections.sort(list);
	}
	
	boolean isInStack(String name) {
		/*
		 * 재고가 남았는지 재고명으로 확인해야 한다면,
		 * 재고가 천 개 이상일 때 심각한 성능 이슈에 직면한다
		 * 1초 안에 항목을 추출하기 위해
		 * 비록 재고를 정렬된 채로 유지해야 하지만
		 * 이진 검색 알고리즘을 쓰기로 결정하였다.
		 */
		
		return Collections.binarySearch(list, new Supply(name)) != -1;
	}
}