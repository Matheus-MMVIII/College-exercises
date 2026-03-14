
import java.util.Scanner;

public class Ex_29 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite o valor da primeira avaliacao: ");
            float score1 = sc.nextFloat();
            
            System.out.print("Digite o valor da segunda avaliacao: ");
            float score2 = sc.nextFloat();
            
            System.out.print("Digite o valor da terceira avaliacao: ");
            float score3 = sc.nextFloat();

            if (score1 > 0 && score2 > 0 && score3 > 0) {
                System.out.println("O valor da media das avaliacoes e de: " + ((score1+score2+score3)/3)); 
            }else {
                System.out.println("Error: tente colocar apenas valores positivos.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
