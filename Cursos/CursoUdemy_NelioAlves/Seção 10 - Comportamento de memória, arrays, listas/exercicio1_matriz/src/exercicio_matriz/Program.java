package exercicio_matriz;

import java.util.Scanner;
import java.util.Locale;
import java.util.Random;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();//O Random gera 10 (exemplo) números aleatórios de 0 até 9,
		
		int min = -20;
		int max = 20;
		
		int qtdNegative = 0;

		/*
		for (int i = 0; i < 10; i++) {
            System.out.println(rand.nextInt(max - min + 1) + min);
        }*/
		
		
		System.out.print("Type a size: ");
		int size = scan.nextInt();
		int[][] matriz = new int[size][size];
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				matriz[i][j] = rand.nextInt(max - min + 1) + min;
				if(matriz[i][j] < 0) {
					qtdNegative++;
				}
			}
		}
		
		System.out.print("\nMatriz: ");
		for(int i = 0; i < matriz.length; i++) {
			System.out.println("");
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
		}
		
		System.out.print("\n\nMain diagonal: ");
		for(int i = 0; i < size; i++) {
				System.out.print(matriz[i][i] + "  ");
			}
		
		System.out.println("\nNegative numbers: " + qtdNegative);
		scan.close();
	}

}
