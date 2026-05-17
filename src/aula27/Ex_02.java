package aula27;

import java.util.Random;
import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {

        Random random = new Random();

        try (Scanner sc = new Scanner(System.in)) {
            int[][] nums = new int[4][4];
            int[] numsTotal = new int[4];
            int numTotal = 0, numMax = 0, numMin = 100, column = 0;

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    nums[i][j] = (random.nextInt(99)+1);
                }
            }

      System.out.println("Matriz: ");
            for (int[] n : nums) {
                for (int m : n) {
                    numTotal += m;
                    numsTotal[column] += m;

                    if (m > numMax) numMax = m;
                    if (m < numMin) numMin = m;
          System.out.print("|"+m);
                }
        System.out.println("|");
                column++;
            }
      System.out.println("Estatisticas: \n" +
              "Soma de todos os elementos da matriz: "+numTotal+".\n" +
              "O maior valor encontrado: "+numMax+".\n" +
              "O menor valor encontrado: "+numMin+".\n" +
              "A media dos elementos: "+(numTotal/16)+".");

            for (int a = 0; a < numsTotal.length; a++) {
        System.out.println("Soma da linha "+(a+1)+": "+numsTotal[a]);
            }

    } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
