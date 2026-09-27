package poo.aula08_22_09.ex_04;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double calcularRendimento() {
        return 0.5;
    }
}
