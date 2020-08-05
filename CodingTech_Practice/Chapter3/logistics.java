package Chapter3;

/**
 * logistics라는 이 패키지는 물류(logistics)를 위한 클래스를 포함한다.
 * 이 패키지의 inventory 클래스는 화물선에 제품을 선적하고,
 * 변질된 제품은 모두 버릴 수 있다.
 * 이 패키지의 클래스 :
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
 * 제품 재고를 관리하는 클래스
 * 
 * <p>
 * 주요 클래스는 {@link logistics.Inventory}로서 아래를 수행한다.
 * <ul>
 * <li> {@link logistics.CargoShip}으로 선적하고,
 * <li> 변질된 {@link logistics.Supply}를 모두 버리고,
 * <li> 이름으로 어떤 {@link logistics.Supply}든 찾는다.
 * </ul>
 * 
 * <p>
 * 이 클래스는 제품을 내리고 변질된 제품은 즉시 모두 버릴 수 있게 해준다.
 * <pre>
 * Inventory inventory = new Inventory();
 * inventory.stockUp(cargoShip.unload());
 * inventory.disposeContaminatedSupplies();
 * inventory.getContaminatedSupplies().isEmpty(); // true
 * </pre>
 */

package logistics;

/**
 * 이 클래스는 화물선을 나타낸다.
 * 제품의 {@link Stack}를 내릴 수 있고 제품의 {@link Queue}를 실을 수 있으며
 * long 타입으로 remainingCapacity를 보여줄 수 있다.
 */

/**
 * 화물선은 용량에 따라 제품을 싣고 내릴 수 있다.
 * 
 * <p>
 * 제품은 순차적으로 선적되고 LIFO순으로 내려진다.
 * 화물선은 용량 만큼만 제품을 저장할 수 있다.
 * 용량은 절대 음수가 아니다.
 */

interface CargoShip {
	Stack<Supply> unload();
	Queue<Supply> load(Queue<Supply> supplies);
	int getRemainingCapacity();
}

interface CargoShip {
	Stack<Supply> unload();
	/**
	 * {@link Supply}를 싣는다.
	 * 
	 * @param {@link Queue} 타입의 제품 제공
	 * @return {@link Queue} 타입의 적재되지 않은 제품
	 */
	Queue<Supply> load(Queue<Supply> supplies);
	
	int getRemainingCapacity();
}

interface CargoShip {
	Stack<Supply> unload();
	/**
	 * 제품을 화물선에 싣는다.
	 * 
	 * <p>
	 * 남은 용량만큼만 제품을 싣게 해준다.
	 * 
	 * 예:
	 * <pre>
	 * int capacity = cargoShip.getRemainingCapacity(); // 1
	 * Queue&lt;Supply> supplies = Arrays.asList(new Supply("Apple"));
	 * Queue&lt;Supply> spareSupplies = cargoShip.load(supplies);
	 * spareSupplies.isEmpty(); // 참
	 * cargoShip.getRemainingCapacity() == 0; // 참
	 * </pre>
	 * 
	 * @param 적재할 제품; 널이면 안된다.
	 * @return 용량이 작아 실을 수 없었던 제품;
	 * 			모두 실었다면 empty
	 * @throws 제품이 널이면 NullPointerException;
	 * @see CargoShip#getRemainingCapacity() 용량을 확인하는 함수
	 * @see CargoShip#unload() 제품을 내리는 함수
	 */
	Queue<Supply> load(Queue<Supply> supplies);
	
	int getRemainingCapacity();
}
