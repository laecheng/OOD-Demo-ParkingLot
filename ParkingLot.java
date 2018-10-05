package demo;

class ParkingLot {
	private final Level[] levels;
	private int size;
	
	public ParkingLot(int numLevel, int numSpotPerLevel) {
		levels = new Level[numLevel];
		for (int i = 0; i < numLevel; i++) {
			levels[i] = new Level(numSpotPerLevel);
		}
		size = 0;
	}
	
	public boolean hasSpot(Vehicle v) {
		for (Level level : levels) {
			if (level.hasSpot(v)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean park(Vehicle v) {
		for (Level level : levels) {
			if (level.hasSpot(v)) {
				level.park(v);
				size++;
				return true;
			}
		}
		return false;
	}
	
	public boolean leave(Vehicle v) {
		for (Level level : levels) {
			if (level.leave(v)) {
				size--;
				return true;
			}
		}
		return false;
	}
	
	public int getSize() {
		return size;
	}
}
