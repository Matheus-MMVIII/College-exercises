package poo.aula04_01_09.ex_01;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 256);
        Livro livro2 = new Livro("O Hobbit", "J. R. R. Tolkien", 310);

        System.out.println("Informações dos livros:");
        livro1.exibirInfo();
        livro2.exibirInfo();

        livro1.setAutor("");
        livro1.setPaginas(-50);

        livro2.setAutor(null);
        livro2.setPaginas(0);

        System.out.println("Livro 1:");
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Páginas: " + livro1.getPaginas());

        System.out.println("\nLivro 2:");
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Páginas: " + livro2.getPaginas());

        livro1.setAutor("José de Alencar");
        livro1.setPaginas(300);

        livro2.setAutor("George Orwell");
        livro2.setPaginas(328);

        livro1.exibirInfo();

        livro2.exibirInfo();
    }
}