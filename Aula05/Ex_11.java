
import java.util.Scanner;

public class Ex_11 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite um horario para converter em min: ");
            int number1 = sc.nextInt();

            System.out.print("Digite os minutos: ");
            int number2 = sc.nextInt();

            System.out.println(number1 * 60 + number2 + " min");

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente apenas o numero.");
        }
    }
}
