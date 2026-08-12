package alg.aula31;

import java.util.Scanner;

public class Ex_01 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(getString("Matheus"));

        System.out.println(plusTwo(14, 24));
        System.out.println(plusTwo(41, 4));
        System.out.println(plusTwo(5, 5));

        printLine();

        try {
            System.out.println("Digite um numero para a verificar se ele e par. ");
            System.out.println(isPair(sc.nextInt()));
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }
        System.out.println(toUpperCase("Qualquer COISA com variacao. "));
        System.out.println(toUpperCase("MAis QuaLqueR COisA. "));

        System.out.println(classNotes(3.3d));
        System.out.println(classNotes(6.4d));
        System.out.println(classNotes(5.1d));
        System.out.println(classNotes(9.0d));

        multiplicationTable(3);
        multiplicationTable(7);

        System.out.println(situation(calcAverage(4.5d, 9.5d, 6.3d)));
    }

    public static String getString(String name) {
        return "Olá, "+name+"! Bem-vindo(a).";
    }

    public static int plusTwo(int a, int b) {
        return a + b;
    }

    public static void printLine() {
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }

    public static boolean isPair(int num) {
        return num % 2 == 0;
    }

    public static String toUpperCase(String message) {
        return message.toUpperCase();
    }

    public static String classNotes(double note) {
        return note >= 9 ? "Excelente" : note >= 7 ? "Aprovado" : note >= 5 ? "Recuperação" : "Reprovado";
    }

    public static void multiplicationTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num*i);
        }
    }

    public static double calcAverage(double a, double b, double c) {
        return (a+b+c)/3;
    }

    public static String situation(double averageNote) {
        return averageNote >= 6 ? "Aprovado" : "Reprovado";
    }
}
