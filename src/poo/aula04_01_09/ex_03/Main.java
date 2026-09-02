package poo.aula04_01_09.ex_03;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.nome = "Matheus";
        aluno2.nome = "João";

        aluno1.exibirInfo();
        aluno2.exibirInfo();

        aluno1.setIdade(-5);
        aluno1.setMatricula("123");

        aluno2.setIdade(150);
        aluno2.setMatricula("1234567");

        System.out.println("Aluno 1:");
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Matrícula: " + aluno1.getMatricula());

        System.out.println("\nAluno 2:");
        System.out.println("Idade: " + aluno2.getIdade());
        System.out.println("Matrícula: " + aluno2.getMatricula());

        aluno1.setIdade(20);
        aluno1.setMatricula("20240001");

        aluno2.setIdade(22);
        aluno2.setMatricula("20240002");

        System.out.println("Aluno 1:");
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Matrícula: " + aluno1.getMatricula());

        System.out.println("\nAluno 2:");
        System.out.println("Idade: " + aluno2.getIdade());
        System.out.println("Matrícula: " + aluno2.getMatricula());

        aluno1.exibirInfo();
        aluno2.exibirInfo();
    }
}