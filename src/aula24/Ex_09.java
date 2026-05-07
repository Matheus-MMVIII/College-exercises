package aula24;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] a = new int[5], b = new int[5];
            for (int i = 0; i < a.length; i++) {
                System.out.println("Digite o "+(1+i)+" numero. ");
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < b.length; i++) {
                b[i] = (int) Math.pow(a[i], 3);
                System.out.println(b[i]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
