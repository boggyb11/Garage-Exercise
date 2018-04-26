package practice;

public class Motorcycle extends Vehicle {
	
public Motorcycle(String Owner, String make,boolean isSidecar) {//constructor
		super(Owner, make);
		Speed();
		Gears();
		Wheels();
		Sidecar(isSidecar);
		calculateBill();
	}

boolean Sidecar;
//int Bill;


	@Override
	public void Speed() {
		this.topSpeed = 160;
	}
	@Override
	public void Gears() {
		this.gears=6;
	}
	@Override
	public void Wheels() {
		this.wheels=2;
	}
	public void Sidecar(boolean isSidecar) {
		this.Sidecar=isSidecar;
	}
	@Override
	public void calculateBill() {
		if (this.fixed==true)
		this.Bill= 85;
	}
	@Override
	public String toString() {
		return "Motorcycle [Sidecar=" + Sidecar + ", Bill=" + Bill + ", topSpeed=" + topSpeed
				+ ", gears=" + gears + ", wheels=" + wheels + ", Owner=" + Owner + ", make=" + make + ", fixed=" + fixed
				+ "]";
	}
}
