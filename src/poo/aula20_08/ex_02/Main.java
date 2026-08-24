package poo.aula20_08.ex_02;

public class Main {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Matheus", 18, "1002");
        Aluno aluno2 = new Aluno("Gabriel", 23, "1020");
        aluno1.exibirDados();
        aluno2.exibirDados();

        aluno1.nome = "Matheus Viturino";
        System.out.println("Nome do aluno: "+aluno1.nome);

        aluno2.matricula = "1021";
        System.out.println("Matricula do "+aluno2.nome+": "+aluno2.matricula);
    }
}
