
import java.util.Scanner;

public class Ex_18 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite o numero de horas trabalhados nos dias do mes: ");
            int number = sc.nextInt();
            
            System.out.println("Digite o preco das horas: ");
            float price = sc.nextFloat();

            if (number > 0 && price > 0) {
                System.out.println("O salario do mes deve ser de: " + (number*price)); 
            }else {
                System.out.println("Error: tente colocar apenas valores positivos.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
