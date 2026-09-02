package poo.aula03_20_08.ex_02;

public class Aluno {
    public String nome;
    public int idade;
    protected String matricula;

    public Aluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        validarIdade();
        this.matricula = matricula;
    }

    public void exibirDados() {
        System.out.println("Nome: "+nome+"\nMatricula: "+matricula);
    }

    private void validarIdade() {
        if (idade > 0) {
            System.out.println("Idade valida. ");
        }else {
            System.out.println("Idade invalida. ");
        }
    }
}
