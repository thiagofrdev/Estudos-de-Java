import java.util.Scanner;
public class ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double total = 0;
		
		System.out.println("===============================================");
		System.out.println("CÓDIGO\t\tPORDUTO\t\t\tPREÇO");
		System.out.println("1\t\tCahorro Quente\t\tR$4,00\n2\t\tX-Salada\t\tR$4,50\n3\t\tX-Bacon\t\t\tR$5,00\n4\t\tTorrada simples\t\tR$2,00\n5\t\tRefrigerante\t\tR$1.50");
		System.out.println("===============================================");
		
		System.out.print("Código: ");
		int cod = ler.nextInt();
		System.out.print("Quantidade: ");
		int qtd = ler.nextInt();
		
		if(cod==1) {
			total = 4*qtd;
		}else if (cod==2){
			total = 4.50*qtd;
		}else if (cod==3){
			total = 5.00*qtd;
		}else if (cod==4){
			total = 2.00*qtd;
		}else if (cod==5){
			total = 1.50*qtd;
		}
		
		System.out.printf("Total: R$%.2f", total);
	}
	
}
