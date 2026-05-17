package aula27;

import java.util.Random;
import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int[][] A = generateMatrix(3,2), B = generateMatrix(2,4), C = new int[3][4];
      System.out.println("A = ");
            printMatrix(A);
      System.out.println("B = ");
            printMatrix(B);

            C = calcMatrix(A, B);
      System.out.println("C =");
            printMatrix(C);

        } catch (Exception e) {
            System.out.println(e.getMessage());
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

    public static int[][] calcMatrix(int[][] matrixA, int[][] matrixB) {
        int[][] matrixFinal = new int[matrixA.length][matrixB[0].length];
        for (int l = 0; l < matrixA.length; l++) {
            for (int c = 0; c < matrixB[0].length; c++) {
                for (int s = 0; s < matrixB.length; s++) {
                    matrixFinal[l][c] += matrixA[l][s] * matrixB[s][c];
                }
            }
        }
        return matrixFinal;
    }
}
