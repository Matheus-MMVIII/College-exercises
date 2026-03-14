
import java.util.Scanner;

public class Ex_39 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite o preco do item quando vendido: ");
            float price = sc.nextFloat();
            
            System.out.print("Digite o preco de fabricacao: ");
            float manufacturingCost = sc.nextFloat();

            if (price > 0 && manufacturingCost > 0) {
                System.out.println("O lucro do produto e de: " + (price - manufacturingCost));
            } else {
                System.out.println("Error: tente colocar apenas valores positivos.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
