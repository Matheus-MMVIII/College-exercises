package poo.aula09_29_09.ex_03;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void venderProduto(int unidades) throws EstoqueInsuficienteException {
        if (unidades > quantidade) {
            throw new EstoqueInsuficienteException("Estoque insuficiente. ");
        }
        quantidade -= unidades;
    }
}
