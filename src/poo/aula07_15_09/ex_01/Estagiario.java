package poo.aula07_15_09.ex_01;

public class Estagiario extends Funcionario {
    public double desconto;

    public Estagiario(String nome, double salario, double desconto) {
        super(nome, salario);
        this.desconto = desconto;
    }
    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: "+nome+"\nSalario: "+salario+"\nDesconto: "+desconto);
    }
}
