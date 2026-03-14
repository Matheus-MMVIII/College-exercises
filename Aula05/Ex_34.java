
import java.util.Scanner;

public class Ex_34 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite a quantidade de km rodados: ");
            float distance = sc.nextFloat();
            
            System.out.print("Digite a velocidade media em km/h: ");
            float speed = sc.nextFloat();
            
            System.out.print("Digite o rendimento do veiculo em porcentaguem: ");
            float performace = sc.nextFloat();

            if (distance > 0 && speed > 0) {
                System.out.println("O consumo de combustivel e de" + (distance*speed*performace));
            }else {
                System.out.println("Error: tente colocar apenas valores positivos.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
