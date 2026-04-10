package aula05;

import java.util.Scanner;

public class Ex_30 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite a nota do primeiro bimestre: ");
            float score1 = sc.nextFloat();
            
            System.out.print("Digite a nota do segundo bimestre: ");
            float score2 = sc.nextFloat();
            
            System.out.print("Digite a nota do terceiro bimestre: ");
            float score3 = sc.nextFloat();

            System.out.print("Digite a nota do quarto bimestre: ");
            float score4 = sc.nextFloat();
            
            if (score1 > 0 && score2 > 0 && score3 > 0 && score4 > 0) {
                System.out.println("A media dos quatro bimestres e de: " + ((score1+score2+score3+score4)/4)); 
            }else {
                System.out.println("Error: tente colocar apenas valores positivos.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
