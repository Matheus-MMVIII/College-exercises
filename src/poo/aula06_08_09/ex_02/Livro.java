package poo.aula06_08_09.ex_02;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Livro(String titulo) {
        this.titulo = titulo;
    }
}
