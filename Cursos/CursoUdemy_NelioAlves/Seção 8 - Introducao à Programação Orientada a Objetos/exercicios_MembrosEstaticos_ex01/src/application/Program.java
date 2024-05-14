package application;

import java.util.Scanner;
import java.util.Locale;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.priceDollar = scan.nextDouble();
		System.out.print("How many dollars will be bought? ");
		CurrencyConverter.bought = scan.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.converter());
		
		scan.close();
	}

}
