
public class Main {

	public static void main(String[] args) {

		
		Room newRoom = new Room();
		newRoom.Area(2500000); // set area in M^2 to be painted
		
		Calculate firstCalculate = new Calculate();
		firstCalculate.CalculateCosts(newRoom.Area);//pass in your area to be painted
		
		
	}

}
