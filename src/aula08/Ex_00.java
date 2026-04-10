package aula08;

import java.util.Scanner;

public class Ex_00 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int num1 = 0;
            int num2 = 0;
            int num3 = 0;
            int num4 = 0;
            int num5 = 0;
            int num6 = 0;

            System.out.printf("Digite o 1º número da equação %d(%d - %d) = -%d(x + %d) + %d: ", num1, num2, num3, num4, num5, num6);
            num1 = sc.nextInt();
            
            System.out.printf("Digite o 2º número da equação %d(%d - %d) = -%d(x + %d) + %d: ", num1, num2, num3, num4, num5, num6);
            num2 = sc.nextInt();
            
            System.out.printf("Digite o 3º número da equação %d(%d - %d) = -%d(x + %d) + %d: ", num1, num2, num3, num4, num5, num6);
            num3 = sc.nextInt();
            
            System.out.printf("Digite o 4º número da equação %d(%d - %d) = -%d(x + %d) + %d: ", num1, num2, num3, num4, num5, num6);
            num4 = sc.nextInt();
            
            System.out.printf("Digite o 5º número da equação %d(%d - %d) = -%d(x + %d) + %d: ", num1, num2, num3, num4, num5, num6);
            num5 = sc.nextInt();
            
            System.out.printf("Digite o 6º número da equação %d(%d - %d) = -%d(x + %d) + %d: ", num1, num2, num3, num4, num5, num6);
            num6 = sc.nextInt();
            
            System.out.println("Equação: ");
            System.out.printf("%d(%d - %d) = -%d(x + %d) + %d: \n", num1, num2, num3, num4, num5, num6);
            System.out.printf("%d * %d = -%dx + %d + %d: \n", num1, (num2 - num3), num4, (num4 * num5), num6);
            System.out.printf("%d = -%dx + %d: \n", (num1 * (num2 - num3)), num4, ((num4 * num5) + num6));//Possui erros que so poderam ser resolvidos com condicionais
            System.out.printf("%dx = %d - %d: \n", num4, ((num4 * num5) + num6), (num1 * (num2 - num3)));
            System.out.printf("x = %d / %d: \n", (((num4 * num5) + num6) - (num1 * (num2 - num3))),num4);
            System.out.printf("x = %d: \n", ((((num4 * num5) + num6) - (num1 * (num2 - num3))) / num4));

        }catch (Exception e) {
            System.out.println("Error: tente colocar apenas numeros.");
        }
    }
}