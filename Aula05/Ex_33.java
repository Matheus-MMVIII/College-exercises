
import java.util.Scanner;

public class Ex_33 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite a data do seu nascimento, substituindo o / por espacos: ");
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();

            System.out.println("Digite a quantidade de anos bissextos que voce ja viveu: ");
            int number = sc.nextInt();

            if (day > 0 && month > 0 && year > 0 && number > 0) {
                System.out.println("Voce ja viveu " + ((2026-year)*365 + number) + " dias.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente apenas o numero.");
        }
    }
}
