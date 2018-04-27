
public enum Paints {
	
			//litres,m^2per litre,price
CHEAPO_MAX ("Cheapo Max",20,10,19.99d),
AVERAGE_JONES("Average Jones", 15,11,17.99d),
DULUXOUROUS_PAINTS("Duluxourous Paints", 10,20^2,25.0d);
	
	String name;
	int Litres;
	int AreaPerLitre;
	double price;
	
	Paints(String name, int Litres,int areaPerLitre,double price) {
		this.name=name;
		this.Litres = Litres;
		this.AreaPerLitre =areaPerLitre;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPaintLitres() {
		
		return Litres;
	}
	public int getAreaPerLitre() {

		return AreaPerLitre;
	}
	public double getPrice() {
		return price;
	}
	
	
	
	
}
