package poo.aula04_01_09.ex_02;

public class Produto {

    public String nome;
    private double preco;
    protected int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void venderPrdutos(int unidades) {
        if (unidades > quantidade) {
            System.out.println("Erro: estoque insuficiente. ");
        } else {
            quantidade -= unidades;
        }
    }

    public void exibirInfo() {
        System.out.println(nome + " - " + quantidade + " em estoque");
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double novoPreco) {
        if (novoPreco <= preco) {
            System.out.println("Erro: novo preço não pode ser menor que o antigo. ");
        } else {
            preco = novoPreco;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Erro: a nova quantidade deve ser maior ou igual a zero. ");
        }
    }

}
