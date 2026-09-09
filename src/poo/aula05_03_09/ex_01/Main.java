package poo.aula05_03_09.ex_01;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Matheus", "12345678901", 3000.00, "Desenvolvedor", 101);

        Funcionario funcionario2 = new Funcionario("Carlos", "98765432100", 2500.00, "Analista", 102);

        System.out.println("Funcionário 1: " + funcionario1.getSalario());
        System.out.println("Funcionário 2: " + funcionario2.getSalario());

        System.out.println("\nTentando alterar o CPF do funcionário 1...");
        System.out.println("CPF antes: " + funcionario1.getCpf());

        funcionario1.setCpf("12345");

        System.out.println("CPF depois: " + funcionario1.getCpf());

        System.out.println("\nAplicando aumento de 10% no funcionário 1...");

        double salarioAntes = funcionario1.getSalario();
        funcionario1.aplicarAumento(10);
        double salarioDepois = funcionario1.getSalario();

        System.out.println("Salário antes: R$ " + salarioAntes);
        System.out.println("Salário depois: R$ " + salarioDepois);

        System.out.println("\nTentando aplicar aumento de -200%...");

        funcionario1.aplicarAumento(-200);

        System.out.println("Salário após tentativa: R$ " + funcionario1.getSalario());
    }
}