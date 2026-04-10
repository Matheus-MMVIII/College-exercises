package aula05;

import java.util.Scanner;

public class Ex_25 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite a quantidade de inimigos abatidos: ");
            float numberKill = sc.nextFloat();
            
            System.out.print("Digite a quantidade de moedas coletadas: ");
            int numberCoin = sc.nextInt();

            if (numberKill > 0 && numberCoin > 0) {
                System.out.println("O total de pontos e de: " + ((numberKill*20) + (numberCoin*50))); 
            }else {
                System.out.println("Error: tente colocar apenas valores positivos.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
