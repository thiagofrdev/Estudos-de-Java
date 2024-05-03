/*
 * Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes 
 * em pagar seus impostos, pois sabem que nele não existem políticos corruptos 
 * e os recursos arrecadados são utilizados em benefício da população, sem
 * qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
 * 
 * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa 
 * de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar
 * de Imposto de Renda, segundo a tabela abaixo.
 * 
 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas 
 * sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00
 * é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8%
 * sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total.
 * O valor deve ser impresso com duas casas decimais.
 */

import java.util.Scanner;
import java.util.Locale;
public class ex08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US);
		double aplicar = 0.0;
		
		System.out.println("===============================================");
		System.out.println("RENDA\t\t\tIMPOSTO");
		System.out.println("R$0.00 - R$2000.00\tIsento\nR$2000.01 - R$3000.00\t8%\nR$3000.01 - R$4500.00\t18%\nAcima de R$4500.00\t28%");
		System.out.println("===============================================");
		
		System.out.print("Salário: ");
		double salario = ler.nextDouble();
		
		aplicar = salario-2000;
		
		if(aplicar<=0) {
			System.out.printf("Isento de imposto\nNovo salário: %.2f", salario);
		} else if (aplicar<=1000) {
			aplicar = aplicar * 0.08;
			System.out.printf("Total a pagar: R$%.2f", aplicar);
		} else if (aplicar>1000 && aplicar<=2500) {
			double aplicar2 = (aplicar-1000)*0.18;
			aplicar = 1000 * 0.08;
			System.out.printf("Total a pagar: R$%.2f", aplicar+aplicar2);
		} else if (aplicar>2500) {
			double aplicar2 = 1500*0.18;
			double aplicar3 = (aplicar-2500)*0.28;
			aplicar = 1000 * 0.08;
			System.out.printf("Total a pagar: R$%.2f", aplicar+aplicar2+aplicar3);
		}
		ler.close();
	}
}
