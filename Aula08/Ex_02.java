import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int num1 = 0;
            int num2 = 0;
            int num3 = 0;
            int num4 = 0;
            int num5 = 0;

            //Equação que tem que resolver 2(5-x)=-3(x+2)+4
            System.out.printf("Digite o 1º número da equação %d(%d - x) = -%d(x + %d) + %d: ", num1, num2, num3, num4, num5);
            num1 = sc.nextInt();
            
            System.out.printf("Digite o 2º número da equação %d(%d - x) = -%d(x + %d) + %d: ", num1, num2, num3, num4, num5);
            num2 = sc.nextInt();
            
            System.out.printf("Digite o 3º número da equação %d(%d - x) = -%d(x + %d) + %d: ", num1, num2, num3, num4, num5);
            num3 = sc.nextInt();
            
            System.out.printf("Digite o 4º número da equação %d(%d - x) = -%d(x + %d) + %d: ", num1, num2, num3, num4, num5);
            num4 = sc.nextInt();
            
            System.out.printf("Digite o 5º número da equação %d(%d - x) = -%d(x + %d) + %d: ", num1, num2, num3, num4, num5);
            num5 = sc.nextInt();
            
            System.out.println("Equação: ");
            System.out.printf("%d(%d - x) = -%d(x + %d) + %d: \n", num1, num2, num3, num4, num5);
            System.out.printf("%d -%dx = -%dx - %d + %d: \n", (num1 * num2), num1, num3, (num3 * num4), num5);
            System.out.printf("-%dx + %dx = %d - %d: \n", num1, num3, (-(num3 * num4) + num5), (num1 * num2));
            System.out.printf("%dx = %d: \n", (-num1 + num3), ((-(num3 * num4) + num5) - (num1 * num2)));


        }catch (Exception e) {
            System.out.println("Error: tente colocar apenas numeros.");
        }
    }
}