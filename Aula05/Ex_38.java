
import java.util.Scanner;

public class Ex_38 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite o valor da primeira avaliacao e seu peso: ");
            float score1 = sc.nextFloat();
            float weight1 = sc.nextFloat();
            
            System.out.print("Digite o valor da segunda avaliacao e seu peso: ");
            float score2 = sc.nextFloat();
            float weight2 = sc.nextFloat();
            
            System.out.print("Digite o valor da terceira avaliacao e seu peso: ");
            float score3 = sc.nextFloat();
            float weight3 = sc.nextFloat();

            if (score1 > 0 && score2 > 0 && score3 > 0 && weight1 > 0 && weight2 > 0 && weight3 > 0) {
                System.out.println("O valor da media das avaliacoes e de: " + ((score1 * weight1 + score2 * weight2 + score3 * weight3) / (weight1 + weight2 + weight3)));
            } else {
                System.out.println("Error: tente colocar apenas valores positivos.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
