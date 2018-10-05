package demo;

abstract class Vehicle {
	/**
	 * Plate information of a Vehicle object
	 */
	private final String plate;
	/**
	 * size information of a Vehicle object
	 */
	private final VehicleSize size;
	/**
	 * Constructor visiable for its sub-class
	 * @param plate
	 * @param size
	 */
	protected Vehicle (String plate, VehicleSize size) {
		this.plate = plate;
		this.size = size;
	}
	/**
	 * do not define as abstract since object has the size field
	 * object does not need to override the getSize() to return a size
	 * abstract method means this method is specific to object
	 * @return
	 */
	public VehicleSize getSize() {
		return size;
	}
	public String getPlate() {
		return plate;
	}
}

class Truck extends Vehicle {
	public Truck (String plate) {
		super(plate, VehicleSize.Large);
	}
}

class Suv extends Vehicle {
	public Suv (String plate) {
		super(plate, VehicleSize.Compact);
	}
}