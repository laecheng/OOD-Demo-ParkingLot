package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Level {
	private final List<ParkingSpot> spots;
	
	Level(int numOfSpots) {
		List<ParkingSpot> list = new ArrayList<>(numOfSpots);
		int i = 0;
		for (; i < numOfSpots / 2; i++) {
			list.add(new ParkingSpot(VehicleSize.Large));
		}
		for (; i < numOfSpots; i++) {
			list.add(new ParkingSpot(VehicleSize.Compact));
		}
		spots = Collections.unmodifiableList(list);
	}
	
	boolean hasSpot(Vehicle v) {
		for (ParkingSpot spot : spots) {
			if (spot.fit(v)) {
				return true;
			}
		}
		return false;
	}
	
	boolean park(Vehicle v) {
		for (ParkingSpot spot : spots) {
			if (spot.fit(v)) {
				spot.park(v);
				return true;
			}
		}
		return false;
	}
	
	boolean leave(Vehicle v) {
		for (ParkingSpot spot : spots) {
			if (spot.getVehicle() == v) {
				spot.leave();
				return true;
			}
		}
		return false;
	}
}
