package geometria;

public class Circulo implements FormaGeometrica {
	private String cor;
    private String quantidadeDeLados;

    public Circulo() {
    }

    public Circulo(String cor, String quantidadeDeLados) {
        this.cor = cor;
        this.quantidadeDeLados = quantidadeDeLados;
    }

    @Override
    public String cor() {
        return cor;
    }

    @Override
    public String quantidadeDeLados() {
        return quantidadeDeLados;
    }

    public double area (double diametro){
        return area(diametro, 0);
    }

    @Override
    public double area(double a, double b) {
        return Math.PI * Math.pow(a, 2) / 4;
    }
}
