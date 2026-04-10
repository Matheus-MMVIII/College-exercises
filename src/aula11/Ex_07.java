package aula11;

import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int condition = 0;
            int conditionRiver;
            int conditionRain;

            String cond = "";

            System.out.println("Digite o valor do nível do rio em metros. ");
            float river = sc.nextFloat();
            System.out.println("Digite o valor da precipitação acumulada em mm.");
            int rain = sc.nextInt();

            if (river>=4) {
                conditionRiver = 4;
            }else if (river>=3 && river<=3.9) {
                conditionRiver = 3;
            }else if (river>=2 && river<=2.9) {
                conditionRiver = 2;
            }else {
                conditionRiver = 1;
            }

            if (rain < 40) {
                conditionRain = 1;
            }else if (rain >= 80) {
                conditionRain = 3;
            }else {
                conditionRain = 2;
            }

            if (conditionRiver == 1 && conditionRain == 1 || conditionRiver == 1 && conditionRain == 2 || conditionRiver == 2 && conditionRain == 1) {
                condition = 1;
            }else if (conditionRiver == 1 && conditionRain == 3 || conditionRiver == 2 && conditionRain == 2 || conditionRiver == 3 && conditionRain == 1) {
                condition = 2;
            }else if (conditionRiver == 2 && conditionRain == 3 || conditionRiver == 3 && conditionRain == 2 || conditionRiver == 4 && conditionRain == 1) {
                condition = 3;
            }else if (conditionRiver == 3 && conditionRain == 3 || conditionRiver == 4 && conditionRain == 2) {
                condition = 4;
            }else if (conditionRiver == 4 && conditionRain == 3) {
                condition = 5;
            }

            switch(condition) {
                case 1 -> cond = "Normal";
                case 2 -> cond = "Atenção";
                case 3 -> cond = "Alerta alto";
                case 4 -> cond = "Alerta máximo";
                case 5 -> cond = "Evacuação imediata";
                default -> System.out.println("Error: condição não encontrada");
            }

            System.out.println("O nível de alerta é de: "+cond);

            sc.close();
        }catch (Exception e) {
            System.out.println("Error: tente apenas numeros.");
        }
    }
}