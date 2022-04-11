package Aluno;

public class Aluno {
	private String nome;
    private Integer matricula;
    private Disciplina disciplina;

    public Aluno() {
    }

    public Aluno(String nome, Integer matricula, Disciplina disciplina) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void media(){
        if(disciplina.media() == 0)
            System.out.println("Aprovado");
        else
            System.out.println("Recuperação");
    }
}
