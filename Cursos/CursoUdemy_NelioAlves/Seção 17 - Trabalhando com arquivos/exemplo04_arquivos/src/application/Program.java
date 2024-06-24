package application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = scan.nextLine();
		
		File path = new File(strPath);//Pega uma pasta digitada pelo usuário. Ex: "c:\temp"
		
		File[] folders = path.listFiles(File::isDirectory);//Cria um array de pastas com as pastas presente no caminho digitado pelo usuário
		System.out.println("FOLDERS: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("\nFILES:");
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\OutraPasta").mkdir();//O próprio prgrama cria outra pasta 
		System.out.println("Directory criated successfully: " + success);
		try {
			FileWriter existe = new FileWriter("..\\OutraPasta\\existe.txt");//Um arquivo para por dentro da nova pasta, para que o Git reconheça a pasta
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		scan.close();
	}

}
