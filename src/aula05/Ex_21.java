package aula05;

import java.util.Scanner;

public class Ex_21 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite o valor do produto: ");
            float price = sc.nextFloat();
            
            System.out.print("Digite a quantidade de meses da parcela: ");
            int number = sc.nextInt();

            if (price > 0 && number > 0) {
                System.out.println("O valor pago em cada mes deve ser de: " + (price/number)); 
            }else {
                System.out.println("Error: tente colocar apenas valores positivos.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
