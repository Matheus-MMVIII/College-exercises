package poo.aula05_03_09.ex_02;

enum TipoConta {
    CORRENTE,
    POUPANCA
}

public class ContaBancaria {
    private String titular; // private pois o valor não deve ser alterado diretamente e não possui set
    private String numeroConta; // private pois o número da conta não deve ser alterado diretamente e não possui set
    private double saldo; // private pois o saldo não pode ser alterado diretamente
    public TipoConta tipoConta; // public pois pode ser acessado e alterado diretamente

    public ContaBancaria(String titular, String numeroConta, double saldo, TipoConta tipoConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Erro: saldo não pode ser negativo. ");
            this.saldo = 0;
        }
        this.tipoConta = tipoConta;
    }

    public ContaBancaria(String titular, String numeroConta, double saldo, String tipoConta) {
        this(titular, numeroConta, saldo, TipoConta.valueOf(tipoConta.toUpperCase()));
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor < 0) {
            System.out.println("Erro: valor inválido. ");
        } else if (valor > saldo) {
            System.out.println("Erro: saldo insuficiente. ");
        } else {
            saldo -= valor;
        }
    }

    public String getNumeroConta() {
        return numeroConta;
    }

}
