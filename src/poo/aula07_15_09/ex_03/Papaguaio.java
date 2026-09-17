package poo.aula07_15_09.ex_03;

public class Papaguaio extends Animal {

    public Papaguaio(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println("Canto");
    }
}
