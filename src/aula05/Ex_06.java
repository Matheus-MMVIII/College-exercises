package aula05;

import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite um numero: ");
            int number1 = sc.nextInt();

            System.out.print("Digite um outro numero: ");
            int number2 = sc.nextInt();

            System.out.println(number1 + number2);

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar apenas numeros.");
        }
    }
}
