package poo.aula07_15_09.ex_01;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: "+nome+"\nSalario: "+salario);
    }
}
