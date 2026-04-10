package aula11;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int condition;
            int conditionS;
            int conditionD;

            String cond = "";

            System.out.print("Digite o valor do PAS e depois de um espaço o do PAD. ");
            int PAS = sc.nextInt();
            int PAD = sc.nextInt();

            if (PAS < 120) {
                conditionS = 1;
            }else if (PAS <= 129) {
                conditionS = 2;
            }else if (PAS <= 139) {
                conditionS = 3;
            }else if (PAS <= 159) {
                conditionS = 4;
            }else if (PAS <= 179) {
                conditionS = 5;
            }else {
                conditionS = 6;
            }

            if (PAD < 80) {
                conditionD = 1;
            }else if (PAD <= 84) {
                conditionD = 2;
            }else if (PAD <= 89) {
                conditionD = 3;
            }else if (PAD <= 99) {
                conditionD = 4;
            }else if (PAD <= 109) {
                conditionD = 5;
            }else {
                conditionD = 6;
            }

            if (conditionS > conditionD) {
                condition = conditionS;
            }else {
                condition = conditionD;
            }

            switch(condition) {
                case 1 -> cond = "Ótimo";
                case 2 -> cond = "Normal";
                case 3 -> cond = "Limítrofe";
                case 4 -> cond = "Hipertensão Grau 1";
                case 5 -> cond = "Hipertensão Grau 2";
                case 6 -> cond = "Hipertensão Grau 3";
                default -> System.out.println("Error: condição não encontrada");
            }

            System.out.println("Paciente classificado como: "+cond);

            sc.close();
        }catch (Exception e) {
            System.out.println("Error: tente apenas numeros.");
        }
    }
}