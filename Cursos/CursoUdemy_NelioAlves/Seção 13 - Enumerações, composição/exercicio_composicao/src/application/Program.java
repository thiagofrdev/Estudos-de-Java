package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");//Cria um formato para receber datas do usuário
		
		System.out.println("Entre com os dados do cliente:");
		System.out.print("Nome: ");
		String name = scan.nextLine();
		System.out.print("Email: ");
		String email = scan.nextLine();
		System.out.print("Nascimento (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(scan.next());//Pega a String e transforma no tipo Data, seguindo o "sdf"
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("\nEntre com status da ordem: ");
		scan.nextLine();
		System.out.print("Status: ");
		String status = scan.nextLine();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
		
		System.out.print("Quantas ordens serão processadas? ");
		int numOrders = scan.nextInt();
		for (int i = 0; i < numOrders; i++) {
			System.out.printf("Entre com o %dº item:\n", i+1);
			scan.nextLine();
			System.out.print("Produto: ");
			String nameProd = scan.nextLine();
			System.out.print("Preço: ");
			double priceProd = scan.nextDouble();
			System.out.print("Quantidade: ");
			int qtdProd = scan.nextInt();
			

			Product product = new Product(nameProd, priceProd);
			OrderItem items = new OrderItem(qtdProd, priceProd, product);
			
			order.addItem(items);//Adiciona os itens na Lista
		}
			
		
		
		System.out.println("\n" + order);
		//System.out.println(sdf.format(birthDate));
		
		scan.close();
	}

}
