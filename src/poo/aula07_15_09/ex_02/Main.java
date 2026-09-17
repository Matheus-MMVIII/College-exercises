package poo.aula07_15_09.ex_02;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Fiat", "Uno", 2005, 4);
        Veiculo moto = new Moto("Honda", "CG 160", 2025, 162);
        Veiculo caminhao = new Caminhao("Volkswagen", "Volvo FH 540", 2025, 7500);

        carro.acelerar();
        moto.acelerar();
        caminhao.acelerar();
    }
}
