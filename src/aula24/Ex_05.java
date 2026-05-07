package aula24;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] names = new String[8];
            for (int i = 0; i < names.length; i++) {
                System.out.println("Digite o "+(1+i)+" nome. ");
                names[i] = sc.next();
            }
            System.out.println("Digite um nome para ser procurado no banco.");
            String nameDigit = sc.next();
            for (int i = 0; i < names.length; i++) {
        if (nameDigit.equals(names[i]))
          System.out.println("O nome esta no banco, na posicao: " + i);
        else System.out.println("O nome nao esta no banco. ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
