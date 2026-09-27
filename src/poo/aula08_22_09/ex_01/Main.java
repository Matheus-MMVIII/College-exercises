package poo.aula08_22_09.ex_01;

public class Main {
    public static void main(String[] args) {
        UsuarioBasico basico = new UsuarioBasico("Matheus", "matheus@gmail.com");
        UsuarioPremium premium = new UsuarioPremium("Danylo", "danylo@gmail.com");
        UsuarioFamilia familia = new UsuarioFamilia("Lorena", "lorena@gmail.com");

        System.out.printf("Basico: %.2f%nPremium: %.2f%nFamilia: %.2f",
                basico.calcularPreco(),
                premium.calcularPreco(),
                familia.calcularPreco());
    }
}
