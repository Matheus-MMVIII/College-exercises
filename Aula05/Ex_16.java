
import java.util.Scanner;

public class Ex_16 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite a distancia percorrida em km: ");
            float distance = sc.nextFloat();

            System.out.print("Digite a quantidade de combustivel usado: ");
            float fuel = sc.nextFloat();

            if (distance > 0 && fuel > 0) {
                System.out.println("Foi usado " + (fuel / distance) + " por km rodado"); 
            }else {
                System.out.println("Error: tente colocar apenas valores positivos.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
