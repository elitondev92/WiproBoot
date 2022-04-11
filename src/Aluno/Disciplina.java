package Aluno;

public class Disciplina {
	private String nome;
    private float nota1;
    private float nota2;
    private float notaTrabalho;

    public Disciplina() {
    }

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public Disciplina(String nome, float nota1, float nota2, float notaTrabalho) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrabalho = notaTrabalho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(float notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public int media(){
        double media = (this.nota1 * 1.5 + this.nota2 * 1.5 + this.notaTrabalho * 2) / 5;
        System.out.println("Sua média é: " + media);
        return media > 7 ? 0 : 1;
    }
}
