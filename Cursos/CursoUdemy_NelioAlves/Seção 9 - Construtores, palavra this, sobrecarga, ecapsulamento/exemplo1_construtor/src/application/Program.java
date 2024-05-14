package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);  
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = scan.nextLine();
		System.out.print("Price: ");
		double price = scan.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = scan.nextInt();
		
		Product product = new Product(name, price, quantity);//Protege de ser criado um objeto sem valores. Um produto sem nome, por exemplo
		
		System.out.println(product);
		
		System.out.print("Quantidade de entrada: ");
		int quantityIn = scan.nextInt();
		product.addProducts(quantityIn);
		
		System.out.println(product);
		
		System.out.print("Quantidade de saida: ");
		quantityIn = scan.nextInt();
		product.removeProducts(quantityIn);
		
		System.out.println(product);
		
		scan.close();
	}

}