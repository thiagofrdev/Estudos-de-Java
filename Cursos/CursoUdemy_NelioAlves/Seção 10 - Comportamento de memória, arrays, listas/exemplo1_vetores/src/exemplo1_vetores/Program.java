package exemplo1_vetores;

import java.util.Scanner;
import java.util.Locale;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Type a number: ");
    int n = sc.nextInt();

    double[] vect = new double[n];

    for(int i = 0; i<n; i++){
      System.out.print("Type a height: ");
      vect[i] = sc.nextDouble();
    }

    double sum = 0.0;
    for(int i = 0; i<n; i++){
      sum += vect[i];
    }

    System.out.printf("Average Height: %.2f", sum/n);
    
    sc.close();
  }
}
