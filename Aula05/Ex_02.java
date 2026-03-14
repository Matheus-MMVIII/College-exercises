
import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite o ano que voce nasceu: ");
            int year = sc.nextInt();

            System.out.println(2026 - year);

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: digite apenas o ano, em numeros.");
        }
    }
}
