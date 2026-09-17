package poo.aula07_15_09.ex_02;

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public void acelerar() {
        System.out.println("Braaaap! Rrrrum-rrrum-VRAAAAM! ");
    }
}
