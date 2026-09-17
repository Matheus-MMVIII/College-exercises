package poo.aula07_15_09.ex_01;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Arthur", 8000, 2000);
        Funcionario estagiario = new Estagiario("Matheus", 1500, 300);
        Funcionario engenheiro = new Engenheiro("Felipe", 6000);

        gerente.exibirInformacoes();
        estagiario.exibirInformacoes();
        engenheiro.exibirInformacoes();
    }
}
