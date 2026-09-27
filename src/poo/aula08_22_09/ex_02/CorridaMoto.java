package poo.aula08_22_09.ex_02;

public class CorridaMoto extends Corrida {

    public CorridaMoto(String origem, String destino, double distancia) {
        super(origem, destino, distancia);
    }

    @Override
    public double calcularValor() {
        return (distancia * 1.5);
    }

    @Override
    public double calcularValor(double desconto) {
        double valor = calcularValor();
        if (valor > desconto) {
            return calcularValor() - desconto;
        } else {
            return 0;
        }
    }
}
