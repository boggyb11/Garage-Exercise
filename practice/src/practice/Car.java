package practice;

public class Car extends Vehicle{
public Car(String Owner, String make, String color) {
		super(Owner, make);
		Speed();
		Gears();
		Wheels();
		color(color);
		calculateBill();
	}

String color;
//int Bill;
	@Override
	public void Speed() {
		this.topSpeed = 200;
	}
	@Override
	public void Gears() {
		this.gears=6;
	}
	@Override
	public void Wheels() {
		this.wheels=4;
	}
	public void color(String color)
	{
		this.color=color;
	}
	@Override
	public void calculateBill() {
		
		if (this.fixed==true)
		this.Bill = 100;
	}
	@Override
	public String toString() {
		return "Car [color=" + color +", Bill=" + Bill + ", topSpeed=" + topSpeed + ", gears="
				+ gears + ", wheels=" + wheels + ", Owner=" + Owner + ", make=" + make + ", fixed=" + fixed + "]";
	}

}
