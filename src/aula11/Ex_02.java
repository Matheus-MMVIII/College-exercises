package aula11;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite a quantidade de itens no estoque. ");
            int num = sc.nextInt();

            if (num > 100) {
                System.out.println("Suficiente");
            }else if (num >= 50) {
                System.out.println("Em alerta");
            }else {
                System.out.println("Abaixo do ideal");
            }

            sc.close();
        }catch (Exception e) {
            System.out.println("Error: tente apenas numeros.");
        }
    }
}