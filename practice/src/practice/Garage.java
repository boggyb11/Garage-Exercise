package practice;

import java.util.ArrayList;

public class Garage {

	
	public static ArrayList<Vehicle> Vehicles = new ArrayList<Vehicle>();
	
	public void iterateVehicles() {
		for( Vehicle vehicle: Vehicles)
		{
			System.out.println(vehicle.toString());
		}
	}
	
	public void removeVehicle(String Owner) {
		for(Vehicle vehicle: Vehicles)
		{
			if (vehicle.Owner == Owner)
			{
				Vehicles.remove(vehicle);
				System.out.println(vehicle.Owner+" Vehicle Successfully removed !");
			}
		}
	}
	public void removeVehicle(Vehicle V) {
		for(Vehicle vehicle: Vehicles)
		{
			if (vehicle.equals(V))
			{
				Vehicles.remove(vehicle);
				System.out.println(vehicle.Owner+" Vehicle Successfully removed !");
			}
		}
	}
	public void fixVehicle(Vehicle V) {
		for(Vehicle vehicle: Vehicles)
		{
			if (vehicle.equals(V))
			{
				vehicle.fixed=true;
				System.out.println(vehicle.Owner+" Vehicle Successfully Fixed !");
			}
		}
	}
	public void calculateBill(Vehicle V) {
		for(Vehicle vehicle: Vehicles)
		{
			if (vehicle.equals(V))
			{
				vehicle.calculateBill();
				System.out.println(" Bill for "+ vehicle.Owner +" is : " + vehicle.Bill);
			}
		}
	}
	public void RemoveAll() {
		Vehicles.removeAll(Vehicles);
		System.out.println(" ALL VEHICLES REMOVED >>!!>>!>!>!>");
	}


}
