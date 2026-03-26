import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean estudante = false;
            float price;

            System.out.println("Digite a sua idade.");
            float idade = sc.nextFloat();

            System.out.println("Você e estudante? Digite Sim/Nâo.");
            String estuda = sc.next();

            if (estuda.equalsIgnoreCase("Sim")) {
                estudante = true;
            }else if (estuda.equalsIgnoreCase("Nâo") || estuda.equalsIgnoreCase("Nao")) {
                estudante = false;
            }

            if (idade < 12) {
                price = 10f;
            }else if (idade <= 17) {
                price = 15f;
            }else if (idade <= 59) {
                price = 20f;
            }else {
                price = 12f;
            }

            if (estudante) {
                price = price/2;
            }

            System.out.println("O valor final a ser pago é: " + price);

        }catch (Exception e) {
            System.out.println("Error: tente colocar apenas numeros.");
        }
    }
}