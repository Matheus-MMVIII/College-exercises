package poo.aula20_08.ex_01;

public class Produto {
    public String nome;
    private double preco;
    protected int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void venderProdutos(int unidades) {
        if (quantidade < unidades) {
            System.out.println("ERROR: Quantidade insuficiente! ");
        }else {
            quantidade -= unidades;
        }
    }

    public void exibirInfo() {
        System.out.println("Nome: "+nome+"\nEstoque: "+quantidade);
    }
}
