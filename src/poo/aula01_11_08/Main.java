package poo.aula01_11_08;

public class Main {
    public static void main(String[] args) {
        System.out.println("|| Pessoa || ");
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Matheus";
        pessoa.idade = 18;
        pessoa.altura = 1.80d;
        pessoa.nacionalidade = "brasileira";

        pessoa.exibirInfo();
        System.out.println("\n\n|| Aniversario ||\n");
        pessoa.aniversario();
        pessoa.exibirInfo();
        System.out.println("\n\n|| Retangulo ||");
        Retangulo retangulo = new Retangulo();
        retangulo.altura = 10.0d;
        retangulo.largura = 20.0d;
        retangulo.exibirArea();
        retangulo.exibirPerimetro();
    }
}
