package aula18;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite o numero do exercicio. ");
            int ex = sc.nextInt();

            switch (ex) {
                case 1 -> {
                    System.out.println("Digite os numeros, separados por espaco. ");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();

                    for (int i = num1; i <= num2; i++) {
                        if (i % 2 == 0)
                            System.out.println(i);
                    }
                }
                case 2 -> {
                    Double totalN = 0.0D, note = 0.0D, quantN = 0.0D;
                    System.out.println("Digite a nota");
                    
                    while ((note = sc.nextDouble()) != 1) {
                        System.out.println("Digite a nota");
                        totalN += note;
                        quantN++;
                    }
                    System.out.println("A media das notas e de: "+(totalN/quantN));
                }
                case 3 -> {
                    int old = 0, quantPeople = 20;

                    for (int i = 0; i < quantPeople; i++) {
                        System.out.println("Digite a idade. ");
                        if (sc.nextInt() >= 18)
                            old++;
                    }
                    System.out.println(old+" Sao maiores de idade e "+(quantPeople-old)+" sao menores");
                }
                case 4 -> {
                    System.out.println("Digite um numero e em seguida a operacao. ");
                    int num = sc.nextInt();
                    String operation = sc.next(), result = "";

                    for (int i = 1; i <= 10; i++) {
                        switch (operation) {
                            case "+" -> result = ""+(num+i);
                            case "-" -> result = ""+(num-i);
                            case "*" -> result = ""+(num*i);
                            case "/" -> result = ""+(num/i);
                        }
                        System.out.println(result);
                    }
                }
                case 5 -> {
                    int numsOdd = 0;

                    for (int i = 0; i < 20; i++) {
                        System.out.println("Digite o numero a ser analisado. ");
                        int num = sc.nextInt();
                        if (num % 2 != 0)
                            numsOdd++;
                    }
                    System.out.println("A um total de "+numsOdd+" numeros impares e "+(20-numsOdd)+" pares. ");

                }
                case 6 -> {
                    int less = 0, average = 0, more = 0;

                    for (int i = 0; i < 20; i++) {
                        System.out.println("Digite o numero a ser analisado. ");
                        int num = sc.nextInt();
                        if (num >= 0 && num <= 100)
                            less++;
                        else if (num >= 101 && num <= 200)
                            average++;
                        else if (num >= 200)
                            more++;
                        else
                            throw new Exception("Numero negativo. ");
                    }
                    System.out.printf("Tiveram:\n%d numeros ente 0 e 100\n%d numeros entre 101 e 200\n%d numeros acima de 200", less, average, more);
                }
                case 7 -> {
                    BigInteger num = BigInteger.valueOf(0), num2 = BigInteger.valueOf(1);
                    System.out.println("Digite a quantidade de vezes a ser repetido");
                    int quant = sc.nextInt();
                    for (int i = 1; i < quant; i++) {//The limit is your pc
                        System.out.println(num);
                        num2 = num2.add(num);
                        System.out.println(num2);
                        num = num.add(num2);
                    }
                }
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //System.out.println("Error: texto colocado no local de numero ou opção não encontrada. ");
        }
    }
}
