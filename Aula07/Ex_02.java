/* 2. Calcular o tempo de enchimento de uma caixa d'água
Uma caixa possui capacidade em litros e está sendo preenchida por uma torneira que libera
litros por minuto.
O usuário deve informar:
Capacidade em litros da caixa
Vazão da torneira (litros por minuto)
O programa deve calcular quanto tempo levará para encher completamente a caixa. */

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite a capacidade da caixa de agua em litros: ");
            float capacity = sc.nextFloat();

            System.out.println("Digite a vazão da torneira em litros por minuto: ");
            float flowRate = sc.nextFloat();

            System.out.println("O tempo necessário para encher a caixa d'água é: " + (capacity / flowRate) + " minutos.");
            sc.close();

        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}