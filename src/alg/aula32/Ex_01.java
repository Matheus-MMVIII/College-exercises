package alg.aula32;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o seu peso em kilograma. ");
            float weight = sc.nextFloat();
            System.out.println("Digite a sua altura em metros. ");
            float height = sc.nextFloat();

            float imc = calcIMC(weight, height);

            System.out.printf("IMC: %.2f \n", imc);
            System.out.println("Classificação: "+situationIMC(imc));
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }
    }

    public static float calcIMC(float weight, float height) {
        return weight/(height*height);
    }

    public static String situationIMC(float imc) {
        return imc >= 30.0f ? "Obesidade" : imc >= 25.0f ? "Sobrepeso" : imc >= 18.5f ? "Normal" : "Abaixo do peso";
    }
}
