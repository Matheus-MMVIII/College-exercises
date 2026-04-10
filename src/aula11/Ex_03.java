package aula11;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float porcent;

            System.out.print("Digite o salário bruto. ");
            Double money = sc.nextDouble();

            if (money <= 2259.20) {
                porcent = 0f;
            }else if (money <= 2826.65) {
                porcent = 7.5f;
            }else if (money <= 3751.05) {
                porcent = 15f;
            }else if (money <= 4664.68) {
                porcent = 22.5f;
            }else {
                porcent = 27.5f;
            }

            System.out.println("A alícota e de: "+porcent+"% e a dedução e de: "+(money*porcent/100));

            sc.close();
        }catch (Exception e) {
            System.out.println("Error: tente apenas numeros.");
        }
    }
}