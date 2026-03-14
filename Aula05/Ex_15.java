
import java.util.Scanner;

public class Ex_15 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite o valor da conta: ");
            float price = sc.nextFloat();

            System.out.print("Digite a quantidade de pessoas: ");
            float numberOfPeople = sc.nextFloat();

            if (price > 0 && numberOfPeople > 0) {
                System.out.println(price / numberOfPeople);
            } else {
                System.out.println("Error: valor ou quantidade de pessoas invalido.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
