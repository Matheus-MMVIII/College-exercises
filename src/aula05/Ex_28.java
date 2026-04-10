package aula05;

import java.util.Scanner;

public class Ex_28 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite a quantidade de km rodados: ");
            float distance = sc.nextFloat();
            
            System.out.print("Digite a velocidade media em km/h: ");
            float speed = sc.nextFloat();

            if (distance > 0 && speed > 0) {
                if ((speed*distance) % 3600 == 0)
                    System.out.println("O tempo da viaguem e de: " + ((speed*distance)/3600) + "h");
                else {
                    System.out.println("O tempo da viaguem e de: " + ((speed*distance)/3600) + "h" + (((speed*distance) % 3600)*60/10) + "min");
                }
            }else {
                System.out.println("Error: tente colocar apenas valores positivos.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
