package aula12;

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean fumante = false;
            float money = 0f;

            System.out.println("Digite a sua idade. ");
            int idade = sc.nextInt();
            System.out.println("Digite o valor do seu IMC. ");
            float imc = sc.nextFloat();
            System.out.println("Digite se você é fumante. (Sim ou Nâo) ");
            String fuma = sc.next();

            if (fuma.equalsIgnoreCase("Sim")) {
                fumante = true;
            } else if (fuma.equalsIgnoreCase("Nâo") || fuma.equalsIgnoreCase("Nao")) {
                fumante = false;
            }

            if (idade >= 18 && idade <= 35) {
                if (fumante == false) {
                    if (imc < 30) {
                        money = 100f;
                    } else {
                        money = 130f;
                    }
                } else {
                    if (imc < 30) {
                        money = 180f;
                    } else {
                        money = 220f;
                    }
                }
            } else if (idade >= 36 && idade <= 55) {
                if (fumante == false) {
                    if (imc < 30) {
                        money = 150f;
                    } else {
                        money = 200f;
                    }
                } else {
                    if (imc < 30) {
                        money = 250f;
                    } else {
                        money = 300f;
                    }
                }
            } else if (idade > 55) {
                if (fumante == false) {
                    if (imc < 30) {
                        money = 250f;
                    } else {
                        money = 320f;
                    }
                } else {
                    money = 400f;
                }
            }

            System.out.println("O premio mensal é de: " + money);

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente apenas numeros.");
        }
    }
}