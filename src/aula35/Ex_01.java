package aula35;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String nome = lerNome(sc);
            double[] notas = lerNotas(sc);
            double media = calcularMedia(notas);
            String situacao = determinarSituacao(media);

            exibirRelatorio(nome, notas, media, situacao);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String lerNome(Scanner sc) {
        String nome;

        System.out.print("Digite o nome do aluno: ");
        nome = sc.next();

        return nome;
    }

    public static double[] lerNotas(Scanner sc) {
        double[] notas = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.printf("\nDigite a nota %s: ", (i+1));
            notas[i] += sc.nextDouble();
            System.out.println(" ");
        }

        return notas;
    }

    public static double calcularMedia(double[] notas) {
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        return (double)(media/notas.length);
    }

    public static String determinarSituacao(double media) {
        if (media >= 7)
            return "Aprovado";
        else if (media >= 4)
            return "Recuperação";
        else
            return "Reprocado";
    }

    public static void exibirRelatorio(String nome, double[] notas, double media, String situacao) {
    System.out.println(
        "===== Relatório Final =====\n"
            + "Aluno: "+nome+"\n"
            + "Notas: "+notas[0]+" "+notas[1]+" "+notas[2]+" "+notas[3]+"\n"
            + "Média: "+media+"\n"
            + "Situação: "+situacao+"\n"
            + "===========================");
    }
}
