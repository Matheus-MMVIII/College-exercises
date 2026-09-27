package poo.aula08_22_09.ex_01;

public class UsuarioFamilia extends Usuario {

    public UsuarioFamilia(String nome, String email) {
        super(nome, email);
    }

    @Override
    public double calcularPreco() {
        return 49.90;
    }

}
