package poo.aula05_03_09.ex_02;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Matheus", "12345", 500.00, TipoConta.CORRENTE);

        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        System.out.println("\nTentando sacar R$ 800,00...");
        conta.sacar(800.00);

        System.out.println("Saldo após tentativa: R$ " + conta.getSaldo());

        System.out.println("\nDepositando R$ 300,00...");
        conta.depositar(300.00);

        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());

        System.out.println("\nSacando R$ 700,00...");
        conta.sacar(700.00);

        System.out.println("Saldo final: R$ " + conta.getSaldo());

    }
}