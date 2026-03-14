
import java.util.Scanner;

public class Ex_36 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int hours = 0;

            System.out.print("Digite os dias trabalhados na semana: ");
            float number = sc.nextFloat();
            
            while (number > 7 || number < 0) {
                System.out.println("Error: tente colocar um numero entre 0 e 7.");
                System.out.print("Digite os dias trabalhados na semana: ");
                number = sc.nextFloat();
            }

            while (number > 0) {
                System.out.println("Digite o numero de horas trabalhadas no dia: " + (8-number));
                int hoursInDay = sc.nextInt();
                while (hoursInDay > 24 || hoursInDay < 0) {
                    System.out.println("Error: tente colocar um numero entre 0 e 24.");
                    System.out.println("Digite o numero de horas trabalhadas no dia: " + (8-number));
                    hoursInDay = sc.nextInt();
                }
                hours = hours + hoursInDay;
                number--;
            }

            System.out.println("O total de horas trabalhadas na semana e de: " + hours);

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
