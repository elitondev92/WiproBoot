package Exercicios;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = entrada.nextLine();
        System.out.print("Digite a primeira nota: ");
        Integer nota1 = entrada.nextInt();
        System.out.print("Digite a segunda nota: ");
        Integer nota2 = entrada.nextInt();

        Integer media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.println("O aluno " + nomeAluno + " foi aprovado!!");
        }else {
            System.out.println("O aluno " + nomeAluno + " foi reprovado!!");
        }
        entrada.close();
        System.out.println("média: " + media);
	}

}
