package alg.aula23;

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
                        "1. Controle de Chamados Resolvidos\n"
                                + "2. Análise de Tempo de Atendimento\n"
                                + "3. Encerrar sistema");
                func = sc.nextInt();

                switch (func) {
                    case 1 -> {
                        System.out.println("Digite a quantidade de dias a serem observados. ");
                        int days = sc.nextInt(), totalCalls = 0, upperToTen = 0;

                        for (int i = 1; i <= days; i++) {
                            System.out.println("Digite a quantidade de chamados realizados pela equipe no dia "+i+". ");
                            int calls = sc.nextInt();
                            totalCalls += calls;
                            if (calls > 15)
                                upperToTen++;
                        }

                        System.out.println("Foram realizados "+totalCalls+" chamados. ");
                        System.out.println("A media diaria dos chamados foi de "+(totalCalls/days)+". ");
                        System.out.println("Em "+upperToTen+" dias do total de "+days+" dias a quantidade de chamados foi superior a 15. \n");

                    }
                    case 2 -> {
                        int num = 0, totalComplexCalls = 0, fastCall = 0;
                        System.out.println("Digite o tempo (em minutos) que levou para resolver um chamado. ");
                        while ((num = sc.nextInt()) >= 0) {
                            System.out.println("Digite o tempo (em minutos) que levou para resolver um chamado. ");
                            if (num > 60)
                                totalComplexCalls += num;
                            else
                                fastCall++;
                        }
                        System.out.println("O total da soma dos chamados complexos e de: "+totalComplexCalls+". ");
                        System.out.println("Foram digitados "+fastCall+" chamadas rapidas. \n");
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