package Salario;

public class App {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();

        Diretor diretor = new Diretor();

        gerente.setSalario(1000);
        gerente.bonus(20000);
        System.out.println(gerente.getSalario());

        diretor.setSalario(2000);
        diretor.bonus(20000);
        System.out.println(diretor.getSalario());
	}

}
