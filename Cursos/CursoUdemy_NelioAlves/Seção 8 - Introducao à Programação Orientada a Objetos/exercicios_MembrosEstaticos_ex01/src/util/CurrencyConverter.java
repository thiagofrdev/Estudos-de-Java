package util;

public class CurrencyConverter {
	public static double priceDollar;
	public static double bought;
	public static double iof = 1.06;
	
	public static double converter(){
		return (bought*priceDollar)*iof;
	}
}
