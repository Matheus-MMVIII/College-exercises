package alg.aula24;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] nums = new int[10];
            int totalPairs = 0;
            for (int i = 0; i < nums.length; i++) {
                System.out.println("Digite o "+(1+i)+" numero. ");
                nums[i] = sc.nextInt();
            }
            for (int num : nums) {
                if (num % 2 == 0)
                    totalPairs++;
            }
      System.out.println("A um total de "+totalPairs+" numeros pares. ");
    } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
