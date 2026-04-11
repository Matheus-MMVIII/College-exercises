package aula15;

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite o numero do exercicio. ");
            int ex = sc.nextInt();

            switch (ex) {
                case 1 -> {
                    System.out.println("Digite o nome de usuario. ");
                    String name = sc.next();

                    System.out.println("Digite a senha. ");
                    String pass = sc.next();

                    if ("admin".equals(name) && "1234".equals(pass)) {
                        System.out.println("Acesso permitido");
                    } else {
                        System.out.println("Acesso negado");
                    }
                }
                case 2 -> {
                    System.out.println("Digite o plano escolhido. ");
                    String flat = sc.next().toUpperCase();
                    Double price = 0D;

                    switch (flat) {
                        case "BASICO" -> price = 50.0D;
                        case "PREMIUN" -> price = 100.0D;
                        case "ULTRA" -> price = 150.0D;
                        default -> throw new Exception();
                    }
                    System.out.println("O preço do plano é de: " + price);
                }
                case 3 -> {
                    System.out.println("Digite o turno das aulas. ");
                    String shift = sc.next().toUpperCase();
                    String turn;

                    switch (shift) {
                        case "M" -> turn = "MATUTINO";
                        case "V" -> turn = "VESPERTINO";
                        case "N" -> turn = "NOTURNO";
                        default -> throw new Exception();
                    }
                    System.out.println(turn);
                }
                case 4 -> {
                    System.out.println("Digite a classe escolhida. ");
                    String userClass = sc.next();
                    String classChoseDescription = "";
                    int numClass = 0;
                    if ("guerreiro".equalsIgnoreCase(userClass)) {
                        numClass = 1;
                    } else if ("mago".equalsIgnoreCase(userClass)) {
                        numClass = 2;
                    } else if ("arqueiro".equalsIgnoreCase(userClass)) {
                        numClass = 3;
                    }

                    switch (numClass) {
                        case 1 -> classChoseDescription = "Especialista em combate corpo a corpo, com alta resistência.";
                        case 2 -> classChoseDescription = "Utiliza poderes mágicos para atacar à distância.";
                        case 3 -> classChoseDescription = "Possui alta precisão em ataques com arco e flecha.";
                        default -> throw new Exception();
                    }

                    System.out.println(classChoseDescription);
                }
                case 5 -> {
                    System.out.println("Digite seu nome. ");
                    String userName = sc.next();
                    System.out.println("Digite o numero do pedido. ");
                    int orderNumber = sc.nextInt();
                    String order = "";

                    switch (orderNumber) {
                        case 2 -> order = "Hambúrguer";
                        case 3 -> order = "Pizza";
                        case 1 -> order = "Salada";
                        default -> throw new Exception();
                    }

                    System.out.println("Nome: " + userName + " Pedido: " + order);
                }
                case 6 -> {
                    System.out.println("Digite o numero do dia da semana. ");
                    int day = sc.nextInt();
                    String dayString = switch (day) {
                        case 1 -> "Domingo";
                        case 2 -> "Segunda-feira";
                        case 3 -> "Terça-feira";
                        case 4 -> "Quarta-feira";
                        case 5 -> "Quinta-feira";
                        case 6 -> "Sexta-feira";
                        case 7 -> "Sábado";
                        default -> throw new Exception();
                    }
                    System.out.println("O dia é: " + dayString);
                }
                case 7 -> {
                    System.out.println("Digite o nome da bebida. ");
                    String order = sc.next();
                    String orderString = "";
                    int orderN = 0;

                    if ("agua".equalsIgnoreCase(order)) {
                        orderN = 1;
                    }else if ("suco".equalsIgnoreCase(order)) {
                        orderN = 2;
                    }else if ("refrigerante".equalsIgnoreCase(order)) {
                        orderN = 3;
                    }

                    switch (orderN) {
                        case 1 -> orderString = "Água";
                        case 2 -> orderString = "Súco";
                        case 3 -> orderString = "Refrigerante";
                        default -> throw new Exception();
                    }
                    System.out.println("A bebida é: " + orderString);
                }
                case 8 -> {
                    System.out.println("Digite os numeros separados por espaço. ");
                    Double num1 = sc.nextDouble();
                    Double num2 = sc.nextDouble();
                    System.out.println("Digite a operação que sera realizada. ");
                    String signal = sc.next();
                    String result;

                    switch (signal) {
                        case "-" -> result = "O resultado é: " + Double.toString(num1 - num2);
                        case "+" -> result = "O resultado é: " + Double.toString(num1 + num2);
                        case "*" -> result = "O resultado é: " + Double.toString(num1 * num2);
                        case "/" -> {
                            if (num2 == 0) {
                                result = "Não é possível dividir por zero";
                                break;
                            }
                            result = "O resultado é: " + Double.toString(num1 / num2);
                        }
                        default -> throw new Exception();
                    }
                    System.out.println(result);
                }
                case 9 -> {
                    System.out.println("Digite o meio de transporte. ");
                    String transport = sc.next();
                    String transportTimeString = "";
                    int transportN = 0;

                    if ("onibus".equalsIgnoreCase(transport)) {
                        transportN = 1;
                    }else if ("metro".equalsIgnoreCase(transport)) {
                        transportN = 2;
                    }else if ("uber".equalsIgnoreCase(transport)) {
                        transportN = 3;
                    }

                    switch (transportN) {
                        case 1 -> transportTimeString = "40 minutos";
                        case 2 -> transportTimeString = "25 minutos";
                        case 3 -> transportTimeString = "30 minutos";
                        default -> throw new Exception();
                    }
                    System.out.println("O tempo medio é de: " + transportTimeString);
                }

            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error: texto colocado no local de numero ou opção não encontrada. ");
        }
    }
}
