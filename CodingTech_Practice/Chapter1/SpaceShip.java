// 불 표현식 간소화
public class SpaceShip {
	
	Crew crew;
	FuelTank fuelTank;
	Hull hull;
	Navigator navigator;
	OxygenTank oxygenTank;
	
	boolean willCrewSurvive() {
		// Not good code
		/*
		 * return hull.holes == 0 && fuelTank.fuel >= navigator.requireFuelToEarth() &&
		 * oxygenTank.lastFor(crew.size) > navigator.timeToEarth();
		 */
		boolean hasEnoughResources = hasEnoughOxygen() && hasEnoughFuel();
		return hull.isIntact() && hasEnoughResources;
	}
	
	private boolean hasEnoughOxygen() {
		return oxygenTank.lastFor(crew.size) > navigator.timeToEarth();
	}
	
	private boolean hasEnoughFuel() {
		return fuelTank.fuel >= navigator.requireFuelToEarth();
	}
}
