package alg.aula24;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] a = new int[5], b = new int[5], c = new int[5];
            for (int i = 0; i < a.length; i++) {
                System.out.println("Digite o "+(1+i)+" numero do vetor a. ");
                a[i] = sc.nextInt();
                System.out.println("Digite o "+(1+i)+" numero do vetor b. ");
                b[i] = sc.nextInt();
            }
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] + b[i];
        System.out.println(c[i]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
