package poo.aula20_08.ex_01;

public class Main {

    public static void main(String[] args) {
        Produto produto = new Produto("Mouse", 50.0d, 4);
        produto.exibirInfo();
        produto.venderProdutos(2);
        produto.exibirInfo();

        produto.nome = "Mouse Gamer";
        System.out.println("Nome do produto: "+produto.nome);

        produto.quantidade++;
        System.out.println("Estoque do produto: "+produto.quantidade);
    }
}
