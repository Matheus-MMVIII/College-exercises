package aula24;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] names = new String[5];
            float[] grades = new float[5];
            for (int i = 0; i < grades.length; i++) {
                System.out.println("Digite o nome do aluno/a. ");
                names[i] = sc.next();
                System.out.println("Digite a media desse aluno. ");
                grades[i] = sc.nextFloat();
            }
            for (int i = 0; i < grades.length; i++) {
        if (grades[i] >= 7.0f) System.out.printf("Nome: %s \nNota: %.1f\n", names[i], grades[i]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
