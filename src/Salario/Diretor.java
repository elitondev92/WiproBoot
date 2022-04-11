package Salario;

public class Diretor extends Funcionario{
	
	public Diretor() {
        super();
    }

    @Override
    public void bonus(double dividendos) {
        this.setSalario(this.getSalario() + dividendos * 0.04);
    }
}
