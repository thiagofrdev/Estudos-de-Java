import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = ler.nextInt();
		
		if(num>0) {
			System.out.println("Esse número é POSITIVO");
		} else {
			System.out.println("Esse número é NEGATIVO");
		}
		ler.close();
	}
}
