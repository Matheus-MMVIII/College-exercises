package poo.aula02_18_08;

public class Livro {
    public String titulo;
    private String autor;
    protected int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void ExibirInfo() {
        System.out.println("Titulo: "+titulo+"\nPaginas: "+paginas);
    }
}
