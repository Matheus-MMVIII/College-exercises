/* 1. Resolver uma equação de primeiro grau
Crie um programa que resolva a equação:
ax+b=0
O usuário deve informar os valores de a e b e o programa deve calcular o valor de x. */

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite o valor de a: ");
            double a = sc.nextDouble();

            System.out.print("Digite o valor de b: ");
            double b = sc.nextDouble();

            if (a == 0) {
                if (b == 0) {
                    System.out.println("A equação tem infinitas soluções.");
                } else {
                    System.out.println("A equação não tem solução.");
                }
            } else {
                double x = -b / a;
                System.out.println("O valor de x é: " + x);
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}