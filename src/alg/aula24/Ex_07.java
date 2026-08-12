package alg.aula24;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] nums = new int[10];
            for (int i = 0; i < nums.length; i++) {
                System.out.println("Digite o "+(1+i)+" numero. ");
                nums[i] += sc.nextInt();
            }
      System.out.println("Digite o numero que ira multiplicar");
            int num = sc.nextInt();
            for (int i = 0; i < nums.length; i++) {
                nums[i] *= num;
        System.out.println(nums[i]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
