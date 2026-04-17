package aula17;

import java.util.Scanner;
import java.util.Random;

public class Ex_01 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite o numero do exercicio. ");
            int ex = sc.nextInt();

            switch (ex) {
                case 1 -> {
                    System.out.println("Digite os segundos faltantes para o embarque. ");
                    int num = sc.nextInt();

                    for (int i = num; i > 0; i--) {
                        System.out.println(i);
                    }
                    if (num <= 0) {
                        throw new Exception("Numero menor que 0");
                    }
                    System.out.println("Embarque iniciado!");
                }
                case 2 -> {
                    System.out.println("Digite o numero. ");
                    int num = sc.nextInt();

                    for (int i = 1; i < 11; i++) {
                        System.out.println(num+"*"+i+" = "+num*i);
                    }
                }
                case 3 -> {
                    Double num = 0.0D;
                    for (int i = 0; i < 7; i++) {
                        System.out.println("Digite o numero de vendas do dia "+(i+1));
                        num += sc.nextDouble();
                    }
                    System.out.println("O total arrecadado e de: "+num+" A media diaria e de: "+(num/7));
                }
                case 4 -> {
                    System.out.println("Digite o total do saldo. ");
                    Double numT = sc.nextDouble();
                    Double numS = 0.0D;

                    while (numT > 0) {
                        System.out.println("Digite o valor a ser sacado. ");
                        Double num = sc.nextDouble();
                        if (num <= 0 || num > numT)
                            break;
                        numS += num;
                        numT -= num;
                    }
                    System.out.println("O saldo restante e de: "+numT+"\nO total sacado e de: "+numS);
                }
                case 5 -> {
                    Random generator = new Random();
                    int num = generator.nextInt(101);
                    int numTyped, numAttempts = 0;
                    System.out.println("Digite o numero da tentativa. ");

                    while ((numTyped = sc.nextInt()) != num) {
                        numAttempts++;
                        if (num > numTyped)
                            System.out.println("O numero digitado e menor que o numero secreto. ");
                        else 
                            System.out.println("O numero digitado e maior que o numero secreto. ");
                    }
                    numAttempts++;
                    System.out.println("Parabens vc acertou o numero, com "+numAttempts+" tentativas. ");
                }
                case 6 -> {
                    String text = "";
                    int stock = 100;
                    System.out.println("Digite E para Entrada, S para Saida, e apos o espaco o valor. ");

                    while (!(text = sc.nextLine()).equals("FIM")) {
                        if (text != null && !text.isEmpty()) {
                            if (text.charAt(0) == 'E') {
                                stock += Integer.parseInt(text.substring(2));
                                System.out.println("O estoque agora e de: "+stock);
                            }else if (text.charAt(0) == 'S') {
                                if ((stock - Integer.parseInt(text.substring(2))) >= 0) {
                                    stock -= Integer.parseInt(text.substring(2));
                                    System.out.println("O estoque agora e de: "+stock);
                                }else {
                                    throw new Exception("Estoque insuficiente, Estoque final: "+stock);
                                }
                            }
                        }
                    }
                }
                case 7 -> {
                    Double num;
                    Double exchange = 5.25D;
                    Double all = 0.0D;
                    int times = 0;

                    System.out.println("Digite o valor a ser convertido. ");

                    while ((num = sc.nextDouble()) >= 0) {
                        Double after = num*exchange;
                        all += after;
                        System.out.println("O valor em dollares e de: "+after);
                        times++;
                    }

                System.out.printf("O total de conversoes e de: %d O total convertido em reais e de: %.2f",times,(all*exchange));
                }
                case 8 -> {
                    String total = "", optionsTable = "opções:\n1-Hamburguer (R$25)\n2-Pizza (R$35)\n3-Salada (R$18)\n4-Sair";
                    Double priceT = 0.0D;
                    int optionChose = 0;

                    do {
                        System.out.println(optionsTable);
                        switch (optionChose) {
                            case 1 -> {
                                total = total + "Hamburguer ";
                                priceT += 25.0D;
                            }
                            case 2 -> {
                                total = total + "Pizza ";
                                priceT += 35.0D;
                            }
                            case 3 -> {
                                total = total + "Salada ";
                                priceT += 18.0D;
                            }
                        }
                        System.out.println("Total a pagar: "+priceT+"\nItens pedidos ate o momento: \n"+total);
                    }while ((optionChose = sc.nextInt()) != 4);
                    System.out.println("Total a pagar: "+priceT+"\nItens pedidos: \n"+total);
                }
                case 9 -> {
                    String password = "";

                    do {
                        System.out.println("Digite a sua senha, com pelo menos 8 caracteres. ");
                    }
                    while ((password = sc.next()).length() < 8 && password != null && !password.isEmpty());
                    System.out.println("Usuario cadastrado com sucesso. ");
                }
                case 10 -> {
                    int quantVotesNull = 0,
                        quantVotesOne = 0,
                        quantVotesTwo = 0,
                        quantVotesThree = 0,
                        voteNow = 0,
                        win = 0;

                    do {
                        System.out.println("Opcoes:\n1 - Candidato Um\n2 - Candidato Dois\n3 - Candidato tres\n9 - Encerrar");

                        switch (voteNow) {
                            case 0 -> quantVotesNull++;
                            case 1 -> quantVotesOne++;
                            case 2 -> quantVotesTwo++;
                            case 3 -> quantVotesThree++;
                        }

                    }while ((voteNow = sc.nextInt()) != 9 && (voteNow == 0 || voteNow == 1 || voteNow == 2 || voteNow == 3));
                    System.out.printf("Tiveram:\n%d votos nulos\n%d votos no Candidato Um\n%d votos no Candidato Dois\n%d votos no Candidato Tres\n", quantVotesNull, quantVotesOne, quantVotesTwo, quantVotesThree);
                    if (Math.max(quantVotesOne, quantVotesTwo) == quantVotesOne) {
                        win = 1;
                        if (Math.max(quantVotesOne, quantVotesThree) == quantVotesThree)
                            win = 3;
                    }else {
                        win = 2;
                        if (Math.max(quantVotesTwo, quantVotesThree) == quantVotesThree)
                            win = 3;
                    }

                    switch (win) {
                        case 1 -> System.out.println("O ganhador foi o Candidato Um, com "+quantVotesOne+" votos.");
                        case 2 -> System.out.println("O ganhador foi o Candidato Dois, com "+quantVotesTwo+" votos.");
                        case 3 -> System.out.println("O ganhador foi o Candidato Tres, com "+quantVotesThree+" votos.");
                    }

                }
                case 11 -> {
                    int numAttempts = 0, password = 1234, attempt = 0;

                    do {
                        if (numAttempts >= 3) {
                            throw new Exception("Cartão bloqueado");
                        }
                        System.out.println("Digite o PIN");
                        numAttempts++;
                        attempt = 0;
                    }
                    while ((attempt = sc.nextInt()) != password);
                    System.out.println("Acesso liberado");
                }

            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //System.out.println("Error: texto colocado no local de numero ou opção não encontrada. ");
        }
    }
}
