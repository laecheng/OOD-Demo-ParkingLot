package demo;

class ParkingSpot {
	private Vehicle currentVechicle;
	private final VehicleSize size;
	
	ParkingSpot(VehicleSize size) {
		this.size = size;
	}
	
	/**
	 * Package level accessiblity
	 */
	boolean fit(Vehicle v) {
		return currentVechicle == null && v.getSize().getSize() <= size.getSize();
	}
	
	void park(Vehicle v) {
		currentVechicle = v;
	}
	
	void leave() {
		currentVechicle = null;
	}
	
	Vehicle getVehicle() {
		return currentVechicle;
	}
}
