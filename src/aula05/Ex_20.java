package aula05;

import java.util.Scanner;

public class Ex_20 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite o valor do produto: ");
            float price = sc.nextFloat();
            
            System.out.print("Digite o valor da taxa: ");
            float priceTax = sc.nextFloat();

            System.out.print("Digite a quantidade de meses: ");
            int number = sc.nextInt();

            if (priceTax > 0 && price > 0 && number > 0) {
                System.out.println("O valor pago em cada mes deve ser de: " + ((price+priceTax)/number)); 
            }else {
                System.out.println("Error: tente colocar apenas valores positivos.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
