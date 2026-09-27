package poo.aula08_22_09.ex_04;

public class Conta {
    protected int numero;
    protected String titular;
    private double saldo;

    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        setSaldo(saldo);
    }

    public double calcularRendimento() {
        return 0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void depositar(double valor, String descricao) {
        depositar(valor);
        System.out.println(descricao);
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        if (getSaldo() > saldo) {
            this.saldo = saldo;
        } else {
            System.err.println("Saldo invalido. ");
        }
    }
}
