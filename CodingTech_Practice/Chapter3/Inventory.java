package Chapter3;

//class Inventory {
//	// �ʵ�(�ϳ��� ����)
//	List<Supply> supplies = new ArrayList<>();  // ��ǰ ����Ʈ
//	
//	// �޼���
//	int countContaminatedSupplies() {
//		// TODO : �ʵ尡 �̹� �ʱ�ȭ�Ǿ�����(���� �ƴ���) �����Ѵ�.
//		
//		int contaminatedCounter = 0; // ī����
//		// ��ǰ�� ������ ������ ���ٴ� ��
//		for(Supply supply : supplies) { // For ����
//			if(supply.isContaminated()) {
//				contaminatedCounter++; // ī���͸� ������Ų��.
//			} // ��ǰ�� �����Ǿ����� IF ��
//		} // FOR ��
//		
//		// ������ ��ǰ ������ ��ȯ�Ѵ�.
//		return contaminatedCounter; //������ ó���Ѵ�!
//	}
//} // Invectory Ŭ���� ��

class Inventory {
	
	List<Supply> supplies = new ArrayList<>();
	
	int countContaminatedSupplies() {
		if(supplies == null || supplies.isEmpty()) {
			// ��ǰ�� ������ ������ ���ٴ� ���̴�.
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