package Aluno;

public class App {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Thiago", 12345, new Disciplina("Banco de Dados", 9.5f, 6.5f, 4));
        aluno.media();
	}

}
