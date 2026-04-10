package aula05;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite um numero: ");
            int number = sc.nextInt();

            System.out.println(number * number);

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
