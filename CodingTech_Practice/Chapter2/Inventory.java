package Chapter2;

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

class Inventory {
	
	private List<Supply> supplies = new ArrayList<>();
	
	void disposeContaminatedSupplies() {
		Iterator<Supply> iterator = supplies.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().isContaminated()) {
				iterator.remove();
			}
		}
	}
}