
import java.util.Scanner;

public class Ex_19 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite o valor do produto: ");
            float price = sc.nextFloat();
            
            System.out.print("Digite o valor da taxa: ");
            float priceTax = sc.nextFloat();

            if (priceTax > 0 && price > 0) {
                System.out.println("O valor pago deve ser de: " + (price+priceTax)); 
            }else {
                System.out.println("Error: tente colocar apenas valores positivos.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
