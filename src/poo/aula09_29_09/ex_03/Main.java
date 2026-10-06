package poo.aula09_29_09.ex_03;

public class Main {
    public static void main(String[] args) {
        try {
            Produto produto = new Produto("Bola", 10.0d, 6);
            produto.venderProduto(7);
        } catch (EstoqueInsuficienteException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
