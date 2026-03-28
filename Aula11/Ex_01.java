import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int numT = 0;
            int[] numL = new int[4];
            
            System.out.print("Digite quatro numeros inteiros separados por espaço. ");
            numL[0] = sc.nextInt();
            numL[1] = sc.nextInt();
            numL[2] = sc.nextInt();
            numL[3] = sc.nextInt();

            for (int i = 0; i < numL.length; i++) {
                if (numL[i] % 2 == 0) {
                    numT += numL[i];
                }
            }

            System.out.println("A soma dos numeros pares é de: " + numT);

            sc.close();
        }catch (Exception e) {
            System.out.println("Error: tente apenas numeros.");
        }
    }
}