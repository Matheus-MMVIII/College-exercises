package poo.aula08_22_09.ex_02;

public class CorridaCarro extends Corrida {

    public CorridaCarro(String origem, String destino, double distancia) {
        super(origem, destino, distancia);
    }

    @Override
    public double calcularValor() {
        return (distancia * 2);
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
