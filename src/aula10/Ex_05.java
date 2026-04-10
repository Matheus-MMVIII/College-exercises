package aula10;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float plusHours = 0f;

            System.out.println("Digite o valor de horas padrão semanal");
            float hoursP = sc.nextFloat();
            
            System.out.println("Digite o valor de horas trabalhadas na semana");
            float hours = sc.nextFloat();

            System.out.println("Digite o preço da hora.");
            float price = sc.nextFloat();

            if (hours > hoursP) {
                plusHours = hours - hoursP;
            }

            System.out.printf("O total a ser pago ao funcionário e de: %.2f", ((hours-plusHours)*price + plusHours*(price+7.5)));

        }catch (Exception e) {
            System.out.println("Error: tente colocar apenas numeros.");
        }
    }
}