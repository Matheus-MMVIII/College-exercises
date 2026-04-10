/* 5. Calcular a área de um círculo

Crie um programa que receba o raio de um círculo e calcule sua área.
A=πr2 */
package aula07;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] rags) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite o raio do circulo em metros: ");
            float r = sc.nextFloat();

            double area = Math.PI * r * r;
            System.out.println("A área do círculo é: " + area + " metros quadrados.");
            
            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}