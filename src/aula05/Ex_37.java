package aula05;

import java.util.Scanner;

public class Ex_37 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite o preco da materia prima: ");
            float price = sc.nextFloat();
            
            System.out.print("Digite o preco da mao de obra: ");
            float priceLabor = sc.nextFloat();

            if (price > 0 && priceLabor > 0) {
                System.out.println("O custo total do produto e de: " + (price + priceLabor));
            } else {
                System.out.println("Error: tente colocar apenas valores positivos.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
