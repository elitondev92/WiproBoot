package Salario;

public class Gerente extends Funcionario {
	
	public Gerente() {
        super();
    }

    @Override
    public void bonus(double dividendos) {
        this.setSalario(this.getSalario() + dividendos * 0.02);
    }
}
