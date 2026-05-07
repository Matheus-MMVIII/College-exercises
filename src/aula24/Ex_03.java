package aula24;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float[] grades = new float[4];
            float totalGrades = 0.0f;
            for (int i = 0; i < grades.length; i++) {
                System.out.println("Digite a "+(1+i)+" nota. ");
                grades[i] = sc.nextFloat();
            }
            for (float grade : grades) {
                totalGrades += grade;
                System.out.println(grade);
            }
      System.out.printf("Media das notas: %.1f", (totalGrades/4));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
