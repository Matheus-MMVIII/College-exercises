package poo.aula04_01_09.ex_01;

public class Livro {
    public String titulo;
    private String autor;
    protected int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void exibirInfo() {
        System.out.println(titulo + " - " + paginas + "paginas");
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.isEmpty()) {
            System.out.println("Error: o valor do novo autor e nulo. ");
        } else {
            this.autor = autor;
        }
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        if (paginas <= 0) {
            System.out.println("Error: o valor das novas paginas e igual ou menor que zero. ");
        } else {
            this.paginas = paginas;
        }
    }
}
