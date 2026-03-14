
import java.util.Scanner;

public class Ex_23 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite a quantidade consumida em kWh: ");
            float number = sc.nextFloat();
            
            System.out.print("Digite o valor do kWh: ");
            float price = sc.nextFloat();

            if (price > 0 && number > 0) {
                System.out.println("O valor pago na conta deve ser de: " + (price*number)); 
            }else {
                System.out.println("Error: tente colocar apenas valores positivos.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
