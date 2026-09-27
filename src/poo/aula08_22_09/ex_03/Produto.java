package poo.aula08_22_09.ex_03;

public class Produto {
    protected String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
    }

    public double calcularPreco() {
        return 0;
    }

    public double calcularPreco(double desconto) {
        return 0;
    }

    public double calcularFrete() {
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.err.println("preco invalido. ");
        }
    }
}
