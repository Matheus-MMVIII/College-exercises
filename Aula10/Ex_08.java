import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean celsius = false;
            Double tempFinal;

            System.out.println("Digite a temperatura.");
            Double temp = sc.nextDouble();

            System.out.println("A mudança e de Celsius para Fahrenheit? Digite Sim/Nâo.");
            String celsiusText = sc.next();

            if (celsiusText.equalsIgnoreCase("Sim")) {
                celsius = true;
            }else if (celsiusText.equalsIgnoreCase("Nâo") || celsiusText.equalsIgnoreCase("Nao")) {
                celsius = false;
            }

            if (celsius) {
                tempFinal = temp * 9/5 + 32;
            }else {
                tempFinal = (temp - 32) * 5/9;
            }
            
            if (celsius) {
                System.out.println("A temperatura final é de: " + tempFinal + "F");
            }else {
                System.out.println("A temperatura final é de: " + tempFinal + "C");
            }

        }catch (Exception e) {
            System.out.println("Error: tente colocar apenas numeros.");
        }
    }
}