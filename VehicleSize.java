package demo;

enum VehicleSize {
	Small(1),
	Compact(2),
	Large(3);
	
	/**
	 * The property of enum
	 */
	private final int size;
	
	/**
	 * Constructor only used by itself.
	 * @param size
	 */
	private VehicleSize(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
}
