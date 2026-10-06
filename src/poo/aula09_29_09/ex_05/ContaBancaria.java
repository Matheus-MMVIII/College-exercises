package poo.aula09_29_09.ex_05;

public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String titular, int numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void saque(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. ");
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
