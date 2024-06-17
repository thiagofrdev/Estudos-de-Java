package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.*;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter the number of products: ");
		int numProds = scan.nextInt();
		
		List<Product> list = new ArrayList<Product>();
		
		for (int i = 0; i < numProds; i++) {
			System.out.printf("Product #%d data:\n", i+1);
			System.out.print("Common, used or imported (c/u/i)? ");
			char status = scan.next().charAt(0);
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Price: R$");
			double price = scan.nextDouble();
			scan.nextLine();
			if(status == 'u') {
				System.out.print("Manufacture Date: ");
				Date date = sdf.parse(scan.nextLine());
				Product prod = new UsedProduct(name, price, date);
				list.add(prod);
			} else if (status == 'i') {
				System.out.print("Customs fee: R$");
				double customsFee = scan.nextDouble();
				Product prod = new ImportedProduct(name, price, customsFee);
				list.add(prod);
			} else {
				Product prod = new Product(name, price);
				list.add(prod);
			}
			System.out.println("");
		}
		
		System.out.println("PRICE TAGS:");
		for (Product product : list) {
			System.out.println(product.priceTag());
		}
		
		scan.close();
	}

}
