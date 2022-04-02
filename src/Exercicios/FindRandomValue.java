package Exercicios;

import java.util.Random;
import java.util.Scanner;

/*
 * 
 * 
 * */

public class FindRandomValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random aleatorio = new Random();
		int valor = aleatorio.nextInt(11);
		
		int tentativas = 0;
		int vlr = 0;
		int i = 1;
		System.out.println("Tente adivinhar o valor gerado entre 0 e 10");
		
		while(i <= 1) {
			vlr = input.nextInt();
			tentativas++;
			if (vlr == valor) {
				System.out.println("Parabéns vc acertou! Nº de tentativas: " + tentativas);
				i++;
			} else {
				String msg = valor > vlr ? "Dica: O valor é maior que: " + vlr : "Dica: O valor é menor que: " + vlr;
				System.out.println(msg);
			}
		}
		System.out.println("Fim");
		input.close();
	}

}
