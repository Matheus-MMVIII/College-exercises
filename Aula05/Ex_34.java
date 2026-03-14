
import java.util.Scanner;

public class Ex_34 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite o valor do salario: ");
            float salary = sc.nextFloat();
            
            System.out.print("Digite o valor do bonus: ");
            float bonus = sc.nextFloat();
            
            System.out.print("Digite o valor do desconto em porcentagem: ");
            float discount = sc.nextFloat();

            if (salary > 0 && bonus > 0) {
                System.out.println("O salario liquido e de" + (salary + bonus - (salary * discount)));
            }else {
                System.out.println("Error: tente colocar apenas valores positivos.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
