package aula27;

import java.util.Random;

public class Ex_05 {

    public static void main(String[] args) {
        int[][] A = generateMatrix(3,3);
        int add = 0;
        String pairsPos = "";
        System.out.println("A = ");
        printMatrix(A);

        for (int i = 0; i < A.length; i++) {
            System.out.println("Resultado da soma da linha "+(i+1));
            for (int j = 0; j < A[i].length; j++) {
                add += A[i][j];
            }
      System.out.println(add);
            add = 0;
        }
    }

    public static int[][] generateMatrix(int line, int column) {
        Random random = new Random();
        int[][] matrix = new int[line][column];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = (random.nextInt(9)+1);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] n : matrix) {
            for (int m : n) {
                System.out.print("|"+m);
            }
            System.out.println("|");
        }
    }

}
