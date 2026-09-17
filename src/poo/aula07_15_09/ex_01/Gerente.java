package poo.aula07_15_09.ex_01;

public class Gerente extends Funcionario {
    public double bonificacao;

    public Gerente(String nome, double salario, double bonificacao) {
        super(nome, salario);
        this.bonificacao = bonificacao;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: "+nome+"\nSalario: "+salario+"\nBonificação: "+bonificacao);
    }
}
