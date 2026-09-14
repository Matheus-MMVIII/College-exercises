package poo.aula06_08_09.ex_03;

public class Filme {
    private String titulo;
    private String diretor;
    private int duracao; // em minutos

    public Filme(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public Filme(String titulo, String diretor) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = 120;
    }
}
