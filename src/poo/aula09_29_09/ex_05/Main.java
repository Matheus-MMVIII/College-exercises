package poo.aula09_29_09.ex_05;

public class Main {
    public static void main(String[] args) {
        double[] array = { 20.3d, 10.4d, 42.1d, 55.0d };

        ContaBancaria contaBancaria = new ContaBancaria("Matheus", 1002, 100.0d);

        try {
            for (int i = 0; i < array.length; i++) {
                contaBancaria.saque(array[i]);
            }
        } catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.printf("saldo restante: %.2f", contaBancaria.getSaldo());
        }
    }
}
