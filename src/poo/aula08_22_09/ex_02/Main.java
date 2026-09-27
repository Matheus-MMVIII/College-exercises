package poo.aula08_22_09.ex_02;

public class Main {
    public static void main(String[] args) {
        CorridaCarro carro = new CorridaCarro("Buriti Shopping", "Fatesg", 15);
        CorridaMoto moto = new CorridaMoto("Buriti Shopping", "Fatesg", 15);
        CorridaExecutiva executiva = new CorridaExecutiva("Buriti Shopping", "Fatesg", 15);

        System.out.printf("Carro: %.2f%nMoto: %.2f%nExecutiva: %.2f%n",
                carro.calcularValor(),
                moto.calcularValor(),
                executiva.calcularValor());

        System.out.printf("%nCom desconto de 5 reais%nCarro: %.2f%nMoto: %.2f%nExecutiva: %.2f",
                carro.calcularValor(5),
                moto.calcularValor(5),
                executiva.calcularValor(5));
    }
}
