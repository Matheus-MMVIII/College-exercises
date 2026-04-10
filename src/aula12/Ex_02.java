package aula12;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean lucroPositivo = false, saudeOculpacional = false, relatorioGRI = false;
            Double reducaoCO2 = 0D;
            int condition = 0;
            String cond = "";

            System.out.println("Digite se a empresa tem lucro. (Sim ou Nâo) ");
            lucroPositivo = isTrue(sc.next());
            System.out.println("Digite se a empresa tem um programa de saúde ocupacional ativo. (Sim ou Nâo) ");
            saudeOculpacional = isTrue(sc.next());
            System.out.println("Digite o percentual de reduçâo de emissôes de CO2 nos últimos 3 anos. ");
            reducaoCO2 = sc.nextDouble();
            System.out.println("Digite se possui relatório GRI publicado. (Sim ou Nâo) ");
            relatorioGRI = isTrue(sc.next());

            if (lucroPositivo == false) {
                condition = 1;
            } else {
                if (saudeOculpacional == false) {
                    condition = 1;
                } else {
                    if (reducaoCO2 >= 30) {
                        if (relatorioGRI == false) {
                            condition = 3;
                        } else {
                            condition = 2;
                        }
                    } else if (reducaoCO2 >= 10 && reducaoCO2 <= 29) {
                        if (relatorioGRI == false) {
                            condition = 4;
                        } else {
                            condition = 3;
                        }
                    } else {
                        condition = 1;
                    }
                }
            }

            switch (condition) {
                case 1 -> cond = "Nâo elegível";
                case 2 -> cond = "Verde ouro";
                case 3 -> cond = "Verde prata";
                case 4 -> cond = "Verde bronze";
                default -> System.out.println("Error: condição não encontrada");
            }

            System.out.println("O nível de alerta é de: " + cond);

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente apenas numeros.");
        }
    }

    static boolean isTrue(String is) {
        if (is.equalsIgnoreCase("Sim")) {
            return true;
        } else {
            return false;
        }
    }
}