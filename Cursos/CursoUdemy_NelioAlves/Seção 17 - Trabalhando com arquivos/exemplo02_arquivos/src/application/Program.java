package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.IIOException;

public class Program {

	public static void main(String[] args) {
		String path = "..\\teste01.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);//Estabelecendo uma sequência de leitura apartir do caminho
			br = new BufferedReader(fr);//Esquema para deixar a leitura mais rápida
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				if(br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
