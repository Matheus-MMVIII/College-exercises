
import java.util.Scanner;

public class Ex_26 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            float heightRemaining = 0f;

            System.out.print("Digite a altura do tanque em cm: ");
            float tankHeight = sc.nextFloat();
            
            System.out.print("Digite a largura do tanque em cm: ");
            float tankWidht = sc.nextFloat();
            
            System.out.print("Digite o comprimento do tanque em cm: ");
            float tankLenght = sc.nextFloat();

            System.out.print("Digite a altura ja preenchida do tanque em cm: ");
            float filledHeight = sc.nextFloat();
            
            if (tankHeight >= filledHeight)
                heightRemaining = tankHeight - filledHeight;
            else
                System.err.println("Error: altura incompativel.");

            if (tankHeight > 0 && tankLenght > 0 && tankWidht > 0) {
                System.out.println("A quantidade de litros faltantes e de: " + (tankWidht*tankLenght*heightRemaining)/1000); 
            }else {
                System.out.println("Error: tente colocar apenas valores positivos.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
