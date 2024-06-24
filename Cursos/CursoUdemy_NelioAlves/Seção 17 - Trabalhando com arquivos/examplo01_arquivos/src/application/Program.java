package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		File file = new File("..\\teste01.txt");
		Scanner scan = null;
		
		try {
			scan = new Scanner(file);
			while (scan.hasNextLine()) {//Testa se existe uma nova linha no arquivo
				System.out.println(scan.nextLine());//Lê a linha até a quebra da linha
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (scan != null) {
				scan.close();
			}
		}
	}
}
