import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite o preço do produto.");
            Double price = sc.nextDouble();

            System.out.println("Digite o valor do desconto em porcentaguem.");
            float descount = sc.nextFloat();

            Double finalPrice = price*(1-descount/100);

            if (finalPrice <= price/2) {
                System.out.println("Desconto muito alto!");
            }else {
                System.out.printf("O preço com o desconto e de: %.0f", finalPrice);
            }

        }catch (Exception e) {
            System.out.println("Error: tente colocar apenas numeros.");
        }
    }
}