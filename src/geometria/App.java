package geometria;

public class App {

	public static void main(String[] args) {
		Circulo circulo = new Circulo("Verde", "0");
        Retangulo retangulo = new Retangulo("Azul", "4");
        Quadrado quadrado = new Quadrado("Vermelho", "4");
        TrianguloRetangulo trianguloRetangulo = new TrianguloRetangulo("Laranja", "3");

        System.out.println(circulo.area(4));
        System.out.println(retangulo.area(4,3));
        System.out.println(quadrado.area(5.3,2.7));
        System.out.println(trianguloRetangulo.area(3.4, 6));

        System.out.println(retangulo.cor());
	}

}
