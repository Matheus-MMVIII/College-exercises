package poo.aula06_08_09.ex_05;

public class Cachorro extends Animal {
    public String raca;

    public Cachorro(String nome, float peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }
}
