package poo.aula07_15_09.ex_02;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void acelerar() {
        System.out.println("Acelerar");
    }

    public void freiar() {
        System.out.println("Freiar");
    }
}
