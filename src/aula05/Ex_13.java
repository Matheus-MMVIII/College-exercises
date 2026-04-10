package aula05;

import java.util.Scanner;

public class Ex_13 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite a altura do triangulo: ");
            int height = sc.nextInt();

            System.out.print("Digite a largura do triangulo: ");
            int width = sc.nextInt();

            System.out.println(height * width / 2);

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente apenas o numero.");
        }
    }
}
