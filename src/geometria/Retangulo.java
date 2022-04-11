package geometria;

public class Retangulo implements FormaGeometrica{

    private String cor;
    private String quantidadeDeLados;

    public Retangulo() {
    }

    public Retangulo(String cor, String quantidadeDeLados) {
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

    @Override
    public double area(double a, double b) {
        return a * b;
    }
}