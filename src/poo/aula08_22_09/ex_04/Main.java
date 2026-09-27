package poo.aula08_22_09.ex_04;

public class Main {
    public static void main(String[] args) {
        ContaDigital digital = new ContaDigital(1, "Matheus", 1000);
        ContaInvestimento investimento = new ContaInvestimento(2, "Alana", 800);
        ContaPoupanca poupanca = new ContaPoupanca(3, "Arthur", 15);

        System.out.printf("Rendiento%nDigital: %.2f%nInvestimento: %.2f%nPoupanca: %.2f%n",
                digital.calcularRendimento(),
                investimento.calcularRendimento(),
                poupanca.calcularRendimento());

        System.out.println("\nDeposito com descricao");
        digital.depositar(100, "Conta digital.");
        investimento.depositar(200, "Conta investimento.");
        poupanca.depositar(50, "Conta poupanca");
    }
}
