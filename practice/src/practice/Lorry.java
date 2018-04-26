package practice;

public class Lorry extends Vehicle{
public Lorry(String Owner, String make,int weightLmit) {
		super(Owner, make);
		Speed();
		Gears();
		Wheels();
		WeightLimit(weightLmit);
		calculateBill();
	}

int weightLimit;
//int Bill;

	@Override
	public void Speed() {
		this.topSpeed = 58;
	}
	@Override
	public void Gears() {
		this.gears=12;
	}
	@Override
	public void Wheels() {
		this.wheels=10;
	}
	public void WeightLimit(int weightLimit) {
		this.weightLimit=weightLimit;
	}
	@Override
	public void calculateBill() {
		if (this.fixed==true)
		this.Bill= 200;
	}
	@Override
	public String toString() {
		return "Lorry [weightLimit=" + weightLimit +", Bill=" + Bill + ", topSpeed=" + topSpeed
				+ ", gears=" + gears + ", wheels=" + wheels + ", Owner=" + Owner + ", make=" + make + ", fixed=" + fixed
				+ "]";
	}
}
