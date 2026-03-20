import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int num1 = 0;
            int num2 = 0;
            int num3 = 0;
            int num4 = 0;
            int num5 = 0;
            int num6 = 0;

            //Equação que tem que resolver 3(y−2)−2(4−3y)=5
            System.out.printf("Digite o 1º número da equação %d(y - %d) - %d(%d - %dy) = %d: ", num1, num2, num3, num4, num5, num6);
            num1 = sc.nextInt();
            
            System.out.printf("Digite o 2º número da equação %d(y - %d) - %d(%d - %dy) = %d: ", num1, num2, num3, num4, num5, num6);
            num2 = sc.nextInt();
            
            System.out.printf("Digite o 3º número da equação %d(y - %d) - %d(%d - %dy) = %d: ", num1, num2, num3, num4, num5, num6);
            num3 = sc.nextInt();
            
            System.out.printf("Digite o 4º número da equação %d(y - %d) - %d(%d - %dy) = %d: ", num1, num2, num3, num4, num5, num6);
            num4 = sc.nextInt();
            
            System.out.printf("Digite o 5º número da equação %d(y - %d) - %d(%d - %dy) = %d: ", num1, num2, num3, num4, num5, num6);
            num5 = sc.nextInt();
            
            System.out.printf("Digite o 6º número da equação %d(y - %d) - %d(%d - %dy) = %d: ", num1, num2, num3, num4, num5, num6);
            num6 = sc.nextInt();
            
            System.out.println("Equação: ");
            System.out.printf("%d(y - %d) - %d(%d - %dy) = %d: \n", num1, num2, num3, num4, num5, num6);
            System.out.printf("%dy - %d - %d + %dy = %d: \n", num1, (num1 * num2), (num3 * num4), (num3 * num5), num6);
            System.out.printf("%dy - %d = %d: \n", (num1 + (num3 * num5)), ((num1 * num2) + (num3 * num4)), num6);
            System.out.printf("%dy = %d: \n", (num1 + (num3 * num5)), (((num1 * num2) + (num3 * num4)) + num6));
            System.out.printf("y = %d / %d: \n", (((num1 * num2) + (num3 * num4)) + num6), (num1 + (num3 * num5)));


        }catch (Exception e) {
            System.out.println("Error: tente colocar apenas numeros.");
        }
    }
}