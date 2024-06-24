package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = scan.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());//Pega apenas o nome do arquivo
		System.out.println("getParent: " + path.getParent());//Pega apenas o caminho do arquivo
		System.out.println("getPath: " + path.getPath());//Pega ambas as informações acima
		
		scan.close();
	}

}
