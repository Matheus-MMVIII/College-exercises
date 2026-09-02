package poo.aula04_01_09.ex_02;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto("Teclado", 100.00, 10);

        produto.exibirInfo();

        produto.venderPrdutos(3);
        produto.exibirInfo();

        produto.venderPrdutos(2);
        produto.exibirInfo();

        produto.venderPrdutos(10);
        produto.exibirInfo();

        produto.setPreco(-50.00);
        produto.setQuantidade(-5);

        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());

        produto.setPreco(150.00);
        produto.setQuantidade(20);

        System.out.println("Nome: " + produto.nome);
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
    }
}