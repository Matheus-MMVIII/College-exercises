package aula11;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int profile = 0;

            String cond = "";

            System.out.println("Digite a renda mensal. ");
            Double money = sc.nextDouble();
            System.out.println("Digite o peso e depois de um espaço a altura.");
            float weight = sc.nextFloat();
            float height = sc.nextFloat();
            System.out.println("Digite o consumo em kWh");
            int spent = sc.nextInt();

            float IMC = weight/((height*height)/10000);

            if (money > 5000 && IMC>18.5 && IMC<24.9 && spent < 150) {
                profile = 1;
            }

            if (spent < 150) {
                profile = 2;
            }

            if (money > 3000 && IMC>18.5 && IMC<24.9) {
                profile = 3;
            }

            if (money>1000 && money<3000) {
                profile = 4;
            }

            if (money < 1000) {
                profile = 5;
            }

            switch(profile) {
                case 1 -> cond = "Sustentável Plus";
                case 2 -> cond = "Sustentável";
                case 3 -> cond = "Saudável";
                case 4 -> cond = "Em Atenção";
                case 5 -> cond = "Vulnerável";
                default -> System.out.println("Error: condição não encontrada");
            }

            System.out.println("O IMC é de: "+IMC+" e o perfil do usúario é de: "+cond);

            sc.close();
        }catch (Exception e) {
            System.out.println("Error: tente apenas numeros.");
        }
    }
}