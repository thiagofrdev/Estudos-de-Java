//Ler um número inteiro N e calcular todos os seus divisores

import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Escreva um número: ");
		int num = ler.nextInt();
		
		for(int i = 1; i<=num; i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		
		
		ler.close();
	}

}
