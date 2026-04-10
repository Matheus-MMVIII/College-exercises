package aula10;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite o seu peso em kg.");
            float weight = sc.nextFloat();

            System.out.println("Digite a sua altura em metros.");
            float height = sc.nextFloat();

            float IMC = weight / (height*2);

            if (IMC < 18.5) {
                System.out.println("Condição de saúde definida como Magreza.");
                System.out.println("Tente comer um pouco mais é fazer mais exercicios, você consegue!");
            }else if (IMC <= 24.9) {
                System.out.println("Condição de saúde definida como Normal");
                System.out.println("Você esta no caminho, continue assim!");
            }else if (IMC <= 29.9) {
                System.out.println("Condição de saúde definida como Sobrepeso");
                System.out.println("Tente comer um pouco menos é fazer mais exercicios, você consegue emagrecer!");
            }else if (IMC <= 39.9) {
                System.out.println("Condição de saúde definida como Obesidade");
                System.out.println("Tente comer um pouco menos é fazer mais exercicios, você consegue emagrecer!");
            }else {
                System.out.println("Condição de saúde definida como Obesidade Grave");
                System.out.println("Tente comer um pouco menos é fazer mais exercicios, você consegue emagrecer!");
            }

        }catch (Exception e) {
            System.out.println("Error: tente colocar apenas numeros.");
        }
    }
}