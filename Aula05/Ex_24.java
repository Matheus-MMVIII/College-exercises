
import java.util.Scanner;

public class Ex_24 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite o valor fixo: ");
            float priceFix = sc.nextFloat();
            
            System.out.print("Digite o valor por km: ");
            float price = sc.nextFloat();
            
            System.out.print("Digite a quantidade de km rodados: ");
            float distance = sc.nextFloat();

            if (price > 0 && priceFix > 0 && distance > 0) {
                System.out.println("O valor pago na corrida deve ser de: " + ((price*distance) + priceFix)); 
            }else {
                System.out.println("Error: tente colocar apenas valores positivos.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
