package poo.aula11_08;

public class Pessoa {
    String nome;
    int idade;
    double altura;
    String nacionalidade;

    public void aniversario() {
        idade++;
    }

    public void exibirInfo() {
        System.out.printf("Nome: %s\nIdade: %d\nAltura: %.2f\nNacionalidade: %s", nome, idade, altura, nacionalidade);
    }
}
