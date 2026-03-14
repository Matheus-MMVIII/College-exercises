
import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite um numero em metro que deseja converter em cm: ");
            int number = sc.nextInt();

            System.out.println(number * 100);

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente apenas o numero.");
        }
    }
}
