
import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite um lado do retangulo: ");
            int disX = sc.nextInt();

            System.out.print("Digite outro lado adjacente do retangulo: ");
            int disY = sc.nextInt();

            System.out.println((disX * 2) + (disY * 2));

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar apenas numeros.");
        }
    }
}
