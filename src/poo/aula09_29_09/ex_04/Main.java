package poo.aula09_29_09.ex_04;

public class Main {
    public static void main(String[] args) {
        try {
            Aluno aluno1 = new Aluno(20);
            Aluno aluno2 = new Aluno(18);
            Aluno aluno3 = new Aluno(121);
        } catch (IdadeInvalidaException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
