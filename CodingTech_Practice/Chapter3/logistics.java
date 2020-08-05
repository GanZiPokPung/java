package Chapter3;

/**
 * logistics��� �� ��Ű���� ����(logistics)�� ���� Ŭ������ �����Ѵ�.
 * �� ��Ű���� inventory Ŭ������ ȭ������ ��ǰ�� �����ϰ�,
 * ������ ��ǰ�� ��� ���� �� �ִ�.
 * �� ��Ű���� Ŭ���� :
 * - Inventory
 * - Supply
 * - Hull
 * - CargoShip
 * - SupplyCrate
 * 
 * @Author A. Lien, H. Uman
 * @version 1.8
 * @since 1.7
 */

/**
 * ��ǰ ��� �����ϴ� Ŭ����
 * 
 * <p>
 * �ֿ� Ŭ������ {@link logistics.Inventory}�μ� �Ʒ��� �����Ѵ�.
 * <ul>
 * <li> {@link logistics.CargoShip}���� �����ϰ�,
 * <li> ������ {@link logistics.Supply}�� ��� ������,
 * <li> �̸����� � {@link logistics.Supply}�� ã�´�.
 * </ul>
 * 
 * <p>
 * �� Ŭ������ ��ǰ�� ������ ������ ��ǰ�� ��� ��� ���� �� �ְ� ���ش�.
 * <pre>
 * Inventory inventory = new Inventory();
 * inventory.stockUp(cargoShip.unload());
 * inventory.disposeContaminatedSupplies();
 * inventory.getContaminatedSupplies().isEmpty(); // true
 * </pre>
 */

package logistics;

/**
 * �� Ŭ������ ȭ������ ��Ÿ����.
 * ��ǰ�� {@link Stack}�� ���� �� �ְ� ��ǰ�� {@link Queue}�� ���� �� ������
 * long Ÿ������ remainingCapacity�� ������ �� �ִ�.
 */

/**
 * ȭ������ �뷮�� ���� ��ǰ�� �ư� ���� �� �ִ�.
 * 
 * <p>
 * ��ǰ�� ���������� �����ǰ� LIFO������ ��������.
 * ȭ������ �뷮 ��ŭ�� ��ǰ�� ������ �� �ִ�.
 * �뷮�� ���� ������ �ƴϴ�.
 */

interface CargoShip {
	Stack<Supply> unload();
	Queue<Supply> load(Queue<Supply> supplies);
	int getRemainingCapacity();
}

interface CargoShip {
	Stack<Supply> unload();
	/**
	 * {@link Supply}�� �ƴ´�.
	 * 
	 * @param {@link Queue} Ÿ���� ��ǰ ����
	 * @return {@link Queue} Ÿ���� ������� ���� ��ǰ
	 */
	Queue<Supply> load(Queue<Supply> supplies);
	
	int getRemainingCapacity();
}

interface CargoShip {
	Stack<Supply> unload();
	/**
	 * ��ǰ�� ȭ������ �ƴ´�.
	 * 
	 * <p>
	 * ���� �뷮��ŭ�� ��ǰ�� �ư� ���ش�.
	 * 
	 * ��:
	 * <pre>
	 * int capacity = cargoShip.getRemainingCapacity(); // 1
	 * Queue&lt;Supply> supplies = Arrays.asList(new Supply("Apple"));
	 * Queue&lt;Supply> spareSupplies = cargoShip.load(supplies);
	 * spareSupplies.isEmpty(); // ��
	 * cargoShip.getRemainingCapacity() == 0; // ��
	 * </pre>
	 * 
	 * @param ������ ��ǰ; ���̸� �ȵȴ�.
	 * @return �뷮�� �۾� ���� �� ������ ��ǰ;
	 * 			��� �Ǿ��ٸ� empty
	 * @throws ��ǰ�� ���̸� NullPointerException;
	 * @see CargoShip#getRemainingCapacity() �뷮�� Ȯ���ϴ� �Լ�
	 * @see CargoShip#unload() ��ǰ�� ������ �Լ�
	 */
	Queue<Supply> load(Queue<Supply> supplies);
	
	int getRemainingCapacity();
}
