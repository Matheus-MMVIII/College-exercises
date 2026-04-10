/* 3. Calcular o volume de uma caixa d'água cilíndrica
Uma caixa d'água possui formato cilíndrico.
O usuário deve informar:
raio da base (r)
altura (h)
O programa deve calcular o volume utilizando a fórmula:
V=πr²h
E mostrar o resultado em litros. */
package aula07;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite o raio da base da caixa d'água em metros: ");
            float r = sc.nextFloat();

            System.out.println("Digite a altura da caixa d'água em metros: ");
            float h = sc.nextFloat();

            double volume = Math.PI * r * r * h;
            System.out.println("O volume da caixa d'água é: " + (volume * 1000) + " litros.");
            sc.close();
            
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}