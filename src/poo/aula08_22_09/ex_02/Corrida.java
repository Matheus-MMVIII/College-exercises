package poo.aula08_22_09.ex_02;

public class Corrida {
    protected String origem;
    protected String destino;
    protected double distancia;

    public Corrida(String origem, String destino, double distancia) {
        this.origem = origem;
        this.destino = destino;
        setDistancia(distancia);
    }

    public double calcularValor() {
        return 0;
    }

    public double calcularValor(double desconto) {
        return 0;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDistancia(double distancia) {
        if (distancia > 0) {
            this.distancia = distancia;
        } else {
            System.err.println("Valor da distancia invalido. ");
        }
    }
}
