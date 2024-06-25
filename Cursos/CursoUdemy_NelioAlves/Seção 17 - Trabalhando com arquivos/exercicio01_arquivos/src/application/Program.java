/*
 * Fazer um programa para ler o caminho de um arquivo .csv contendo os dados de itens 
 * vendidos. Cada item possui um nome, preço unitário e quantidade, separados por
 * vírgula. Você deve gerar um novo arquivo chamado "summary.csv", localizado em uma 
 * subpasta chamada "out" a partir da pasta original do arquivo de origem, contendo 
 * apenas o nome e o valor total para aquele item (preço unitário multiplicado pela 
 * quantidade), conforme exemplo.
 */

package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter a file path: ");
		String sourceFileStr = scan.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		System.out.println(success);
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
			String product = br.readLine();//Lê a primeira linha do arquivo
			while(product != null) {
				String[] fields = product.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int qunatity = Integer.parseInt(fields[2]);
				
				products.add(new Product(name, price, qunatity));
				
				product = br.readLine();
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
				for (Product productItem : products) {
					bw.write(productItem.getName() + "," + String.format("%.2f", productItem.totalPrice())) ;
					bw.newLine();
				}
			}
			catch(IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}

/* Desenvolver uma lógica de pedir ao usuário para digitar as informações do produto e criar o summary.csv
	Scanner scan = new Scanner(System.in);
	String[] products = null;
	
	System.out.print("How many products will be insert?: ");
	int qtd = scan.nextInt();
	
	System.out.println("\nEnter the product following this model (Name,Price,Quantity): ");
	scan.nextLine();
	for (int i = 0; i < qtd; i++) {
		System.out.printf("Produto %d: ", i+1);
		String prod = scan.nextLine();
		products = prod.split(",");
	}
	
	for(String product : products) {
		System.out.println(product);
	}

	scan.close();
}
*/