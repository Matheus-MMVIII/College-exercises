package poo.aula07_15_09.ex_02;

public class Caminhao extends Veiculo {
    private int capacidadeDeCarga;

    public Caminhao(String marca, String modelo, int ano, int capacidadeDeCarga) {
        super(marca, modelo, ano);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public void acelerar() {
        System.out.println("VRRRRRRRRRRRR-Xiii-VRRRRRRR! ");
    }
}
