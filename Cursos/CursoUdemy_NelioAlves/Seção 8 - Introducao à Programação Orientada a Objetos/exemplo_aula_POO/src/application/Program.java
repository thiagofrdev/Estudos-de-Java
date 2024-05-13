package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in); 
		
		Product product = new Product();//Cria um OBJETO "product" que está a espeda dos valores 
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = scan.nextLine();
		System.out.print("Price: ");
		product.price = scan.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = scan.nextInt();
		
		System.out.println(product);//Poderia referenciar o ".toString" mas o Java já subentende que deve ser chamado algum toString
		
		System.out.print("Quantidade de entrada: ");
		int quantity = scan.nextInt();
		product.addProducts(quantity);
		
		System.out.println(product);
		
		System.out.print("Quantidade de saida: ");
		quantity = scan.nextInt();
		product.removeProducts(quantity);
		
		System.out.println(product);
	}

}
