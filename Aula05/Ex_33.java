
import java.util.Scanner;

public class Ex_33 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float priceTotal = 0;

            System.out.println("Digite o total de itens");
            int numberOfItens = sc.nextInt();
            
            System.out.println("Digite o valor do desconto em porcentaguem");
            float numberOfDescount = sc.nextFloat();
            
            System.out.println("Digite o valor da taxa aplicada");
            float numberTax = sc.nextFloat();

            while (numberOfItens > 0) {
                System.out.print("Digite o numero total de itens comprados: ");
                int number = sc.nextInt();

                System.out.print("Digite o preco do item comprado: ");
                float price = sc.nextFloat();

                if (number > 0 && price > 0) {
                    priceTotal = priceTotal + (number*price*numberOfDescount);
                    numberOfItens--;
                } else {
                    System.out.println("Error: tente colocar apenas valores positivos.");
                }
            }
            System.out.println("O valor total de compras e de: " + (priceTotal+numberTax));

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
