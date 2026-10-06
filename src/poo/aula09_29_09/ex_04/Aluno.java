package poo.aula09_29_09.ex_04;

public class Aluno {
    private int idade;

    public Aluno(int idade) throws IdadeInvalidaException {
        setIdade(idade);
    }

    public void setIdade(int idade) throws IdadeInvalidaException {
        if (idade < 0 || idade > 120) {
            throw new IdadeInvalidaException("Idade invalida. ");
        }
        this.idade = idade;
    }
}
