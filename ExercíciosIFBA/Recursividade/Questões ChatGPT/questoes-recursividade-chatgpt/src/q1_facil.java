/*Implemente uma função recursiva que calcula o fatorial de um número 
𝑛, onde 𝑛!=𝑛×(𝑛−1)×...×1. Use como base o código que te passei antes.*/
import java.util.Scanner;

public class q1_facil {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Escreva um número: ");
		int n = scan.nextInt();
		
		System.out.println(fatorial(n));
	}
	
	public static int fatorial (int n){
		//Condição de parada
		if(n == 0 || n == 1) {
			return 1;
		}
		
		//Recursividade
		return n * fatorial(n-1);
	}

}
