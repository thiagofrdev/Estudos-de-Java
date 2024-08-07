/*
 * Fazer um programa em Java que leia uma matriz de no máximo 10 linhas por 10 colunas e que faça a multiplicação
 * dessas matrizes. A multiplicação das matrizes deve ser feita em uma sub-rotina com passagem das matrizes por
 * parâmetro. O programa deve solicitar do usuário a ordem das matrizes antes de lê-las e checar se as matrizes 
 * podem ser multiplicadas (pesquisar qual o pré-requisito para a multiplicação de matrizes) e caso as ordens 
 * digitadas não esteja de acordo informar ao usuário e solicitar novamente ou oferecer uma forma para que o 
 * usuário não execute o programa.
 */

package desafiofinal;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] matriz1 = null, matriz2 = null;
		
		for(int i = 0; i < 2; i++) {
			System.out.printf("Digite o a quantidade de LINHAS da %dº matriz: ", i+1);
			int linhas = scan.nextInt();
			System.out.printf("Digite o a quantidade de COLUNAS da %dº matriz: ", i+1);
			int colunas = scan.nextInt();
			if(colunas > 10 || linhas > 10) {
				System.out.println("Não se pode passar de 10 colunas ou linhas!\nExecute o programa novamente");
				System.exit(0);
			}
			if(i==0)
				matriz1 = povoarMatriz(linhas, colunas);
			if(i==1)
				matriz2 = povoarMatriz(linhas, colunas);
		}
		
		System.out.println("\nMatriz 1:");
		exibirMatriz(matriz1);
		System.out.println("\nMatriz 2:");
		exibirMatriz(matriz2);
		System.out.println("\nMatriz 3:");
		if(multimplicarMatrizes(matriz1, matriz2) != null)
			exibirMatriz(multimplicarMatrizes(matriz1, matriz2));
		
		scan.close();
	}
	
	public static int[][] povoarMatriz(int linhas, int colunas) {
		int[][] matriz = new int[linhas][colunas];
		Random rand = new Random();
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++)
				matriz[i][j] = rand.nextInt(10);
		}		
		return matriz;
	}
	
	public static void exibirMatriz(int matriz[][]){
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++)
				System.out.print("[" + matriz[i][j] + "] \t");
			System.out.println();
		}
	}

	public static int[][] multimplicarMatrizes(int matriz1[][], int matriz2[][]){
		//A matriz resultante terá a quantidade de linhas da 1ª matriz a a quantidade de colunas da 2ª matriz
		int linhasMat1 = matriz1.length;
		int colunasMat1 = matriz1[0].length; //Quantidade de colunas da 1ª para auxuliar no cálculo
		int colunasMat2 = matriz2[0].length;
		
		int[][] matriz = new int[linhasMat1][colunasMat2];
		
		if(matriz1[0].length == matriz2.length) {
			for (int i = 0; i < linhasMat1; i++) { //Itera cada linha da matriz 1 para comaçar a criar a matriz resultante
				for (int j = 0; j < colunasMat2; j++) { //Itera cada coluna da matriz 2  para comaçar a criar a matriz resultante
					matriz[i][j] = 0; //Inicializa o elemento resultante correspondente
					for(int k = 0; k < colunasMat1; k++)
						matriz[i][j] += matriz1[i][k] * matriz2[k][j];
				}
			}
			return matriz;
		} else {
			System.out.println("Essas matrizes não podem ser multiplicadas");
			return null;
		}
	}
}