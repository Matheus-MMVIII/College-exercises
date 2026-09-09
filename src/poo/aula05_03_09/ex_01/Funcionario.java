package poo.aula05_03_09.ex_01;

public class Funcionario {
    private String nome; // private pois o valor não muda
    private String cpf; // private pois ja tem get e set
    private double salario; // private pois ja tem set
    public String cargo; // public pois pode mudar e não a set
    private int matricula; // private pois o valor não muda

    public Funcionario(String nome, String cpf, double salario, String cargo, int matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.cargo = cargo;
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            System.out.println("Erro: Cpf invalido. ");
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("Erro: o novo salario e menor que 0. ");
        }
    }

    public void aplicarAumento(double percentual) {
        setSalario(salario + salario * percentual / 100);
    }
}
