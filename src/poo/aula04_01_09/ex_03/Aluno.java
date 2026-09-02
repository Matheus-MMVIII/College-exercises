package poo.aula04_01_09.ex_03;

public class Aluno {
    public String nome;
    private int idade;
    protected String matricula;

    public void exibirInfo() {
        System.out.println(nome + " - Matrícula: " + matricula);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0 && idade < 120) {
            this.idade = idade;
        } else {
            System.out.println("Erro: a idade tem que estar entre 1 e 119");
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula.length() != 8 && !matricula.isEmpty()) {
            System.out.println("Erro: o tamanho da nova matricula tem que ser exatamente 8");
        } else {
            this.matricula = matricula;
        }
    }
}
