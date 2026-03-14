
import java.util.Scanner;

public class Ex_29 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite o preco do item: ");
            int price = sc.nextInt();
            
            System.out.print("Digite o valor do desconto em porcentaguem: ");
            int number = sc.nextInt();

            if (price > 0 && number > 0)
                System.out.println("O preco final e de: " + (price + (price*number)));
            else
                System.out.println("Error: tente colocar apenas valores positivos.");

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
