
import java.util.Scanner;

public class Ex_12 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite um lado do quadrado: ");
            int number = sc.nextInt();

            System.out.println(number * number);

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente apenas o numero.");
        }
    }
}
