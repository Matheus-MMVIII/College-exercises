package poo.aula08_22_09.ex_02;

public class CorridaExecutiva extends Corrida {

    public CorridaExecutiva(String origem, String destino, double distancia) {
        super(origem, destino, distancia);
    }

    @Override
    public double calcularValor() {
        return (distancia * 3.5);
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
