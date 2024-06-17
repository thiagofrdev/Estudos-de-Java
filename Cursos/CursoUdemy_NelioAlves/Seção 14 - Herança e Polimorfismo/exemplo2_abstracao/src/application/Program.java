package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int num = scan.nextInt();
		
		List<Shape> shapes = new ArrayList<Shape>();
		
		for (int i = 0; i < num; i++) {
			System.out.printf("Shape #%d data: \n", i+1);
			System.out.print("Rectangle or Circle (r/c)? ");
			char shape = scan.next().charAt(0);
			if(shape == 'r') {
				System.out.print("Color (BLACK/BLUE/RED): ");
				Color color = Color.valueOf(scan.next());
				System.out.print("Width: ");
				double width = scan.nextDouble();
				System.out.print("Height: ");
				double height = scan.nextDouble();
				shapes.add(new Rectangle(color, width, height));
			}
			if(shape == 'c') {
				System.out.print("Color (BLACK/BLUE/RED): ");
				Color color = Color.valueOf(scan.next());
				System.out.print("Radious: ");
				double radious = scan.nextDouble();
				shapes.add(new Circle(color, radious));
			}
			System.out.println("");
		}
		
		System.out.println("SHAPE AREAS:");
		for (Shape shape : shapes) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		scan.close();
	}

}
