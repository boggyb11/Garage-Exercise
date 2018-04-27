
public class Calculate {

	double waste;
	double cost;
	double PaintArea;
	double Cheapest=0;
	String CheapestPaint;
	public void CalculateCosts(double Area) {
		
		for(Paints Paint : Paints.values()) {
			
		do{
			PaintArea += Paint.AreaPerLitre*Paint.Litres;
			cost = cost + Paint.price;
			CheapestPaint(Paint);
		}
		 while(PaintArea <Area);
		
		waste = (PaintArea-Area)/Paint.AreaPerLitre; //waste in litres
		cost = Math.round(cost*100.0)/100.0; // calculating to nearest penny
		System.out.println("\t"+Paint.name);
		System.out.println("Waste in litres : " + waste);
		System.out.println("Cost : "+ cost);
		System.out.println("-----------------------------------------------------------------");

		}
		System.out.println("The Cheapest Paint is : " + CheapestPaint + " at : £"+ Cheapest);
	}
	
	public void CheapestPaint(Paints paint) {
		
		if(Cheapest!=0) {
			if (cost<Cheapest) {
				Cheapest = cost;
				CheapestPaint = paint.name;
			}
		}
		else  {
			Cheapest = cost;
			CheapestPaint = paint.name;
		}
		
	}
	
	
}
