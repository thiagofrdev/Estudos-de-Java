/*
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
 * sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração 
 * mínima de 1 hora e máxima de 24 horas.
 */

import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int total = 0;
		
		System.out.print("Início: ");
		int horaIni = ler.nextInt();
		System.out.print("Fim: ");
		int horaFim = ler.nextInt();
		
		if (horaIni<horaFim) {
			total = horaFim-horaIni;
		} else { //Quando cai aqui é porque passou de um dia (Passou da meia noite)
			total = 24 - horaIni + horaFim;
		}

		System.out.printf("O jogo durou %d hora(s)", total);
	}

}
