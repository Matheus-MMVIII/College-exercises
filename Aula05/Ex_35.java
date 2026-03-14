
import java.util.Scanner;

public class Ex_35 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite a largura do terreno: ");
            float width = sc.nextFloat();
            
            System.out.print("Digite a altura do terreno: ");
            float height = sc.nextFloat();

            if (width > 0 && height > 0) {
                System.out.println("A area do terreno e de" + (width * height * 2));
            }else {
                System.out.println("Error: tente colocar apenas valores positivos.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
