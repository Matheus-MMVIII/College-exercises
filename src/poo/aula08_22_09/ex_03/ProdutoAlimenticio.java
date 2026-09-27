package poo.aula08_22_09.ex_03;

public class ProdutoAlimenticio extends Produto {

    public ProdutoAlimenticio(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPreco() {
        return getPreco();
    }

    @Override
    public double calcularPreco(double desconto) {
        double valor = calcularPreco();
        if (valor > desconto) {
            return calcularPreco() - desconto;
        } else {
            return 0;
        }
    }
}
