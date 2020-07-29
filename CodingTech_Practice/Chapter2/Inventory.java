package Chapter2;

import java.util.Collections;
import java.util.Objects;
import java.util.regex.Pattern;

//class Inventory {
//	
//	private List<Supply> supplies = new ArrayList<>();
//	
//	void disposeContaminatedSupplies() {
//		for(Supply supply : supplies) {
//			if(supply.isContaminated()) {
//				supplies.remove(supply);
//			}
//		}
//	}
//}

//class Inventory {
//	
//	private List<Supply> supplies = new ArrayList<>();
//	
//	void disposeContaminatedSupplies() {
//		Iterator<Supply> iterator = supplies.iterator();
//		while(iterator.hasNext()) {
//			if(iterator.next().isContaminated()) {
//				iterator.remove();
//			}
//		}
//	}
//}

// 순회하며 계산 집약적 연산하지 않기
//class Inventory {
//	
//	private List<Supply> supplies = new ArrayList<>();
//	
//	List<Supply> find(String regex) {
//		List<Supply> result = new LinkedList<>();
//		for(Supply supply : supplies) {
//			if(Pattern.matches(regex, supply.toString())) {
//				result.add(supply);
//			}
//		}
//		return result;
//	}
//}

//class Inventory {
//	
//	private List<Supply> supplies = new ArrayList<>();
//	
//	List<Supply> find(String regex) {
//		List<Supply> result = new LinkedList<>();
//		Pattern pattern = Pattern.compile(regex);
//		for(Supply supply : supplies) {
//			if(Pattern.matcher(supply.toString()).matches()) {
//				result.add(supply);
//			}
//		}
//		return result;
//	}
//}

// 자바 API
//class Inventory {
//	
//	private List<Supply> supplies = new ArrayList<>();
//	
//	int getQuantity(Supply supply) {
//		if(supply == null) {
//			throw new NullPointerException("supply must not be null");
//		}
//		
//		int quantity = 0;
//		for(Supply supplyInStock : supplies) {
//			if(supply.equals(supplyInStock)) {
//				++quantity;
//			}
//		}
//		return quantity;
//	}
//}

class Inventory {
	
	private List<Supply> supplies = new ArrayList<>();
	
	int getQuantity(Supply supply) {
		Objects.requireNonNull(supply, "supply must not be null");
		return Collections.frequency(supplies, supply);
	}
}
