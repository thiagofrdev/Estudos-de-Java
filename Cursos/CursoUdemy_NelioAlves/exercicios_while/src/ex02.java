/*
 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade 
 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o 
 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem 
 * alguma).
 */

import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Insira X: ");
		int x = ler.nextInt();
		System.out.print("Insira Y: ");
		int y = ler.nextInt();
		
		while(x != 0 && y != 0) {
			if(x>=1 && y>=1) {
				System.out.println("Quadrante 1");
			} else if (x<0 && y>=1) {
				System.out.println("Quadrante 2");
			} else if (x>=1 && y<0) {
				System.out.println("Quadrante 4");
			} else if (x<0 && y<0) {
				System.out.println("Quadrante 3");
			}
			System.out.print("Insira X: ");
			x = ler.nextInt();
			System.out.print("Insira Y: ");
			y = ler.nextInt();
		}
		
		ler.close();
	}

}
