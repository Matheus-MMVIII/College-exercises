package alg.aula24;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] nums = new int[5];
            for (int i = 0; i < nums.length; i++) {
        System.out.println("Digite o "+(1+i)+" numero. ");
                nums[i] = sc.nextInt();
            }
            for (int num : nums) {
        System.out.println(num);
            }
        } catch (Exception e) {
        System.out.println(e.getMessage());
        }
    }
}
