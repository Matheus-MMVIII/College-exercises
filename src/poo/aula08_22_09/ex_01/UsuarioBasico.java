package poo.aula08_22_09.ex_01;

public class UsuarioBasico extends Usuario {

    public UsuarioBasico(String nome, String email) {
        super(nome, email);
    }

    @Override
    public double calcularPreco() {
        return 19.90;
    }
}
