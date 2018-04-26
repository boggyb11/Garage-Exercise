package practice;




public class Main {
	
	
	public static void main (String[]args) {
		Garage myGarage = new Garage();
		
		Motorcycle M1 = new Motorcycle("Jeff", "Triumph",false);
		Car C1 = new Car("Jenny", "Volkswagen", "Red");
		Lorry L1 = new Lorry("Fabio", "Mercedes-Benz", 22);
	
		Garage.Vehicles.add(M1);	
		Garage.Vehicles.add(C1);	
		Garage.Vehicles.add(L1);	
		
	
		myGarage.iterateVehicles();
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		
		myGarage.removeVehicle(C1.Owner);
		myGarage.iterateVehicles();
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		Lorry L2 = new Lorry("Benjo", "Scania", 25);
		Lorry L3 = new Lorry("Sam", "Mann", 25);
		Lorry L4 = new Lorry("James", "Scania", 10);
		Garage.Vehicles.add(L2);
		Garage.Vehicles.add(L3);
		Garage.Vehicles.add(L4);
		
		myGarage.iterateVehicles();
		
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		
		myGarage.removeVehicle(L3);
		
		System.out.println("---------------------------------------------------------------------------------------------------------------");

		myGarage.fixVehicle(M1);
		myGarage.fixVehicle(L1);
		System.out.println("---------------------------------------------------------------------------------------------------------------");

		myGarage.calculateBill(M1);
		myGarage.calculateBill(L1);
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		//remove all from garage here
		myGarage.RemoveAll();//removes all 
		myGarage.iterateVehicles();// no vehicles to iterate through now
		
	}

}
