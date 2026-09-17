package poo.aula07_15_09.ex_03;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Chico", 12);
        Animal gato = new Gato("Banguela", 7);
        Animal papaguaio = new Papaguaio("Jose", 5);

        cachorro.fazerSom();
        gato.fazerSom();
        papaguaio.fazerSom();
    }
}
