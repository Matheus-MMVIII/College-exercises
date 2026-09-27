package poo.aula08_22_09.ex_01;

public class UsuarioPremium extends Usuario {

    public UsuarioPremium(String nome, String email) {
        super(nome, email);
    }

    @Override
    public double calcularPreco() {
        return 34.90;
    }
}
