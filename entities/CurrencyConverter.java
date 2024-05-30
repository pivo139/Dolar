package entities;

public class CurrencyConverter {

	public static double iof = 6.0;
	
	public double DollarPrice;
	public double DollarQuantity;
	
	public double amount() {
		return DollarPrice * DollarQuantity;
	}
	
	public void conversion(double iof) {
		DollarQuantity += DollarQuantity * iof/100.0;
	}
	
}
