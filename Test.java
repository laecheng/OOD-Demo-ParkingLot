package demo;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		// 10 spots of Large, 10 spots of Compact
		ParkingLot lot = new ParkingLot(2, 10);
		List<Vehicle> list = new ArrayList<>();
		for (int i = 0; i < 12; i++) {
			final Vehicle v = new Truck("T"+i);
			if (lot.hasSpot(v)) {
				System.out.println("Still has Spot for Truck: " + i); 
				lot.park(v);
				System.out.println("Vechile " + v.getPlate() + " parked");
				list.add(v);
			} else {
				System.out.println("No Spot for Truck" + v.getPlate());
			}
		}
		System.out.println("Current size of Parking lot: " + lot.getSize());
		for (int i = 0; i < 12; i++) {
			final Vehicle v = new Suv("V"+i);
			if (lot.hasSpot(v)) {
				System.out.println("Still has Spot for Suv: " + i); 
				lot.park(v);
				System.out.println("Vechile " + v.getPlate() + " parked");
				list.add(v);
			} else {
				System.out.println("No Spot for Suv" + v.getPlate());
			}
		}
		for (Vehicle v : list) {
			lot.leave(v);
			System.out.println("Vechile " + v.getPlate() + " has left");
		}
		System.out.println("Current size of Parking lot: " + lot.getSize());
	}
}
