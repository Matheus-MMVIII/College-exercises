package aula24;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] a = new int[5], b = new int[5];
            boolean equal = true;
            for (int i = 0; i < a.length; i++) {
                System.out.println("Digite o "+(1+i)+" numero do vetor a. ");
                a[i] = sc.nextInt();

                System.out.println("Digite o "+(1+i)+" numero do vetor b. ");
                b[i] = sc.nextInt();
            }
            for (int i = 0; i < b.length; i++) {
                if (a[i] != b[i])
                    equal = false;
            }
      if (equal) System.out.printf("Os vetores sao iguais. ");
      else System.out.println("Os vetores nao sao iguais. ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
