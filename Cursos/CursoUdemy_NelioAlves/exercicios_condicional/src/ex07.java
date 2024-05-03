/*
 * Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um
 * ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se
 * está sobre um dos eixos cartesianos ou na origem (x = y = 0).
 * Se o ponto estiver na origem, escreva a mensagem “Origem”.
 * Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
 */

import java.util.Scanner;
import java.util.Locale;
public class ex07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US);
		
		System.out.print("Eixo X: ");
		double x = ler.nextDouble();
		System.out.print("Eixo Y: ");
		double y = ler.nextDouble();
		
		if (x==0 && y==0) {
			System.out.println("Origem");
		} else if (x>0 && y>=0 || x>=0 && y>0) {
			System.out.println("Q1");
		} else if (x<=0 && y>0 || y>=0 && x<0) {
			System.out.println("Q2");
		} else if (x<=0 && y<0 || x<0 && y<=0) {
			System.out.println("Q3");
		} else if (x>=0 && y<0 || x>0 && y<=0) {
			System.out.println("Q4");
		}
		ler.close();
	}

}
