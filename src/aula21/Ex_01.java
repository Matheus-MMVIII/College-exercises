package aula21;

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {
        String user = "", password = "";
        boolean userValid = false;
        int func = 0;

        try (Scanner sc = new Scanner(System.in)) {

            for (int i = 0; i < 3; i++) {
                System.out.println("Digite o nome de usuario. ");
                user = sc.next();

                System.out.println("Digite a senha. ");
                password = sc.next();

                if (user.equals("admin") && password.equals("1234")) {
                    userValid = true;
                    break;
                }else
                    System.out.println("Nome e ou senha do usuario invalidos. ");
            }

            if (!userValid)
                throw new Exception("Acesso bloqueado, numero maximo de tentativas feitas.");

            do {
                System.out.println(
                        "1. Controle de atividades realizadas em sala\n" +
                        "2. Análise de números informados pelo usuário\n" +
                        "3. Encerrar sistema");
                func = sc.nextInt();

                switch (func) {
                    case 1 -> {
                        System.out.println("Digite a quantidade de dias a serem observados. ");
                        int days = sc.nextInt(), totalActivites = 0, upperToTen = 0;

                        for (int i = 1; i <= days; i++) {
                            System.out.println("Digite a quantidade de atividades realizadas pela turma no dia "+i+". ");
                            int activities = sc.nextInt();
                            totalActivites += activities;
                            if (activities > 10)
                                upperToTen++;
                        }

                        System.out.println("Foram realizadas "+totalActivites+" atividades. ");
                        System.out.println("A media diaria das atividades foi de "+(totalActivites/days)+". ");
                        System.out.println("Em "+upperToTen+" dias do total de "+days+" dias a producao de atividades foi superios a 10. \n");

                    }
                    case 2 -> {
                        int num = 0, numsOdd = 0, totalNumPair = 0;
                        System.out.println("Digite um numero inteiro a ser analisado. ");
                        while ((num = sc.nextInt()) >= 0) {
                            System.out.println("Digite um numero inteiro a ser analisado. ");
                            if (num % 2 == 0)
                                totalNumPair += num;
                            else
                                numsOdd++;
                        }
                        System.out.println("O total da soma dos numeros pares e de: "+totalNumPair+". ");
                        System.out.println("Foram digitados "+numsOdd+" numeros impares. \n");
                    }
                    case 3 -> {
                        break;
                    }
                    default -> System.out.println("Opcao invalida. ");
                }
            }while (func != 3);

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
