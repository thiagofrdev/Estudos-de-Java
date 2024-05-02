//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
import java.util.Scanner; 

public class ex02 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = ler.nextInt();
		
		if(num%2==0) {
			System.out.println("Esse número é PAR");
		} else {
			System.out.println("Esse número é IMPAR");
		}
	}

}
