package Chapter3;

import java.util.Collections;

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

//class Inventory {
//	
//	List<Supply> supplies = new ArrayList<>();
//	
//	int countContaminatedSupplies() {
//		if(supplies == null || supplies.isEmpty()) {
//			// ��ǰ�� ������ ������ ���ٴ� ���̴�.
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
//		// ���� ����
//		return Collections.binarySearch(list, new Supply(name)) != -1;
//	}
//}

class Inventory {
	// ����Ʈ�� ���ĵ� ä�� �����Ѵ�. isInStack()�� �����Ѵ�.
	private List<Supply> list = new ArrayList<>();
	
	void add(Supply supply) {
		list.add(supply);
		Collections.sort(list);
	}
	
	boolean isInStack(String name) {
		/*
		 * ��� ���Ҵ��� �������� Ȯ���ؾ� �Ѵٸ�,
		 * ��� õ �� �̻��� �� �ɰ��� ���� �̽��� �����Ѵ�
		 * 1�� �ȿ� �׸��� �����ϱ� ����
		 * ��� ��� ���ĵ� ä�� �����ؾ� ������
		 * ���� �˻� �˰����� ����� �����Ͽ���.
		 */
		
		return Collections.binarySearch(list, new Supply(name)) != -1;
	}
	
}

class Inventory {

	List<Supply> supplies;

	/**
	 * �� Inventory�� ������
	 */
	Inventory() {
		this(new ArrayList<>());
	}

	/**
	 * �� Inventory�� �� �ٸ� ������
	 * 
	 * ��ǰ�� Inventory�� �߰��� �� �ִ� ������
	 */
	Inventory(Collection<Supply> initialSupplies) {
		this.supplies = new ArrayList<>(initialSupplies);
	}
}

class Inventory {

	List<Supply> supplies;

	/**
	 * �� ��� �����Ѵ�.
	 * 
	 * @see Inventory#Inventory(Collection) �ʱ� ��ǰ�� �ʱ�ȭ�ϴ� �Լ�
	 */
	Inventory() {
		this(new ArrayList<>());
	}

	/**
	 * ��ǰ�� ó������ ������ ��� �����Ѵ�.
	 * 
	 * @param initialSupplies	��ǰ�� �ʱ�ȭ�Ѵ�.
	 * 						   	���̸� �� �ǰ� �� �� �ִ�.
	 * @throws NullPointerException initialSupplies�� ���� ��
	 * @see Inventory#Inventory() ��ǰ���� �ʱ�ȭ�ϴ� �Լ�
	 */
	Inventory(Collection<Supply> initialSupplies) {
		this.supplies = new ArrayList<>(initialSupplies);
	}
}

