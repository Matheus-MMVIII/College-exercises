package poo.aula11_08;

public class Retangulo {
    double altura;
    double largura;

    public double calcularArea() {
        return altura * largura;
    }

    public double calcularPerimetro() {
        return altura*2+largura*2;
    }

    public void exibirArea() {
        System.out.println(calcularArea());
    }

    public void exibirPerimetro() {
        System.out.println(calcularPerimetro());
    }
}
