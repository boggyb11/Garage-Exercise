package practice;



abstract public class Vehicle {
	 int topSpeed;
	 int gears;
	 int wheels;
	 int Bill;
	 String Owner;
	 String make;
	 boolean fixed;
	 
	 public Vehicle(String Owner,String make) {
		 this.Owner=Owner;
		 this.make= make;
	 }
	
	
	abstract public void Speed();
	abstract public void Gears();
	abstract public void Wheels();
	abstract public void calculateBill();


	
}
