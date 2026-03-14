
import java.util.Scanner;

public class Ex_17 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int priceTotal = 0;

            System.out.println("Digite o total de itens");
            int numberOfItens = sc.nextInt();

            while (numberOfItens > 0) {
                System.out.print("Digite o numero total de itens comprados: ");
                int number = sc.nextInt();

                System.out.print("Digite o preco do item comprado: ");
                int price = sc.nextInt();

                if (number > 0 && price > 0) {
                    priceTotal = priceTotal + (number*price);
                    numberOfItens--;
                } else {
                    System.out.println("Error: tente colocar apenas valores positivos.");
                }
            }
            System.out.println("O valor total de compras e de: " + priceTotal);

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
