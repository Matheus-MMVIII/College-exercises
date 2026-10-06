package poo.aula09_29_09.ex_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade do produto. ");

        int quantidade = sc.nextInt();

        System.out.println("Digite a quantidade de lojas. ");

        int numeroLojas = sc.nextInt();

        String[] nomeLojas = new String[numeroLojas];

        try {
            System.out.println("Quantidade que vai para cada loja: "+(quantidade/numeroLojas));
            System.out.println(nomeLojas[numeroLojas+1]);
        } catch (ArithmeticException ex) {
            System.out.println("Tentativa de divisao por 0. ");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Tentativa de acessar index maior que o tamanho do array. ");
        }
    }
}
