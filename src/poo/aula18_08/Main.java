package poo.aula18_08;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Clean Code", "Robert Cecil Martin", 431);
        Livro livro2 = new Livro("O Programador Pragmático", "Dave Thomas", 344);

        livro1.ExibirInfo();
        livro2.ExibirInfo();
    }
}
