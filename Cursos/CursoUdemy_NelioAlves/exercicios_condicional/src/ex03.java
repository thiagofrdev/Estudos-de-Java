/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" 
ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os 
números devem poder ser digitados em ordem crescente ou decrescente.*/
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Primeiro número: ");
		int num1 = ler.nextInt();
		System.out.print("Segundo número: ");
		int num2 = ler.nextInt();
		
		if(num1%num2==0 || num2%num1==0) {
			System.out.println("SÃO multiplos");
		} else {
			System.out.println("NÃO são multiplos");
		}
		
	}

}
