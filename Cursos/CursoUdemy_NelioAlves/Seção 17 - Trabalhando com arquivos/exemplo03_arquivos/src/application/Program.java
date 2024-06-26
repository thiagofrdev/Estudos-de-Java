package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "..\\teste02.txt";
		
		//new FileWriter(path) --> cria/recria um arquivo
		//new FileWriter(path, true) --> acrescenta ao final do arquivo
		
		//try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}

