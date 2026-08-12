package alg.aula27;

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {

        int lines, columns;

        try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Digite o numero de linhas da matriz. (max 10)");
            lines = sc.nextInt();
            if (lines > 10) throw new Exception("Numero de linhas superior a 10, num: "+lines);
      System.out.println("Digite o numero de colunas da matriz. (max 10)");
            columns = sc.nextInt();
            if (columns > 10) throw new Exception("Numero de colunas superior a 10, num: "+columns);

            int[][] nums = new int[lines][columns];

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
          System.out.printf("Digite o numero da matriz na linha %d e na coulna %d \n", (i+1), (j+1));
                    nums[i][j] = sc.nextInt();
                }
            }

            for (int[] n : nums) {
                for (int m : n) {
          System.out.print("|"+m);
                }
        System.out.println("|");
            }
        }catch (Exception e) {
      System.out.println(e.getMessage());
        }
    }
}
