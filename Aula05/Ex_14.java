
import java.util.Scanner;

public class Ex_14 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite o valor do produto: ");
            float price = sc.nextFloat();

            System.out.print("Digite o valor dado como pagamento: ");
            float recibe = sc.nextFloat();

            if (price <= recibe) {
                System.out.println("O valor que deve ser dado como troco e: " + (recibe - price));
            } else {
                System.out.println("Dinheiro recebido insuficiente para realizar a compra");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
