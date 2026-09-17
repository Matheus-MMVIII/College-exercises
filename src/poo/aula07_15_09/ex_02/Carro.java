package poo.aula07_15_09.ex_02;

public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void acelerar() {
        System.out.println("Vrum-vruuum-VRUUUUUUUHHH! ");
    }
}
