/*Escreva uma função recursiva que calcula a soma de todos os números de 1 até 
𝑛 (exemplo: para 𝑛=5, a soma é 1+2+3+4+5).*/
package q2_recursividade;

import java.util.Iterator;
import java.util.Scanner;

public class q2_facil {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Escreva um número: ");
		int n = scan.nextInt();
		
		System.out.printf("A soma de 1 até %d resulta em %d",n,somaRecursiva(5)); 
	}
	
	public static int somaRecursiva(int n) {
		if(n<=1) {return 1;}
		return n+somaRecursiva(n-1);
	}


}
