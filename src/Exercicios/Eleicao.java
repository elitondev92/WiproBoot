package Exercicios;

import java.util.Random;

public class Eleicao {

	public static void main(String[] args) {
        int cout1 = 0, cout2 = 0, cout3 = 0, cout4 = 0;
        String[] alunos = {"Ronaldo", "Ronaldinho", "Pelé", "Romário"};
        
        Random random = new Random(); 
        
        int votantes = 30;
        for (int i=1;i<=votantes;i++) {
            int voto = random.nextInt(4) + 1;
            switch (voto) {
                case 1:
                    cout1++;

                    break;
                case 2:
                    cout2++;

                    break;
                case 3:
                    cout3++;

                    break;
                case 4:
                    cout4++;
                    break;
            }
        }

        System.out.println(alunos[0] + ": " + cout1 + " votos");
        System.out.println(alunos[1] + ": " + cout2 + " votos");
        System.out.println(alunos[2] + ": " + cout3 + " votos");
        System.out.println(alunos[3] + ": " + cout4 + " votos");
	}

}
