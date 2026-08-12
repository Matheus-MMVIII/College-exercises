package alg.aula27;

import java.util.Random;

public class Ex_06 {

    public static void main(String[] args) {
        int[][] A = generateMatrix(3,3);
        int plus10 = 0;
        String plusPos = "";
        System.out.println("A = ");
        printMatrix(A);

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] > 10) {
                    plus10++;
                    plusPos = plusPos + "\nLinha: "+(i+1)+" Coluna: "+(j+1);
                }
            }
        }

        System.out.println("A um total de "+ plus10 +" numero maiores que 10 nas posicoes: "+ plusPos);
    }

    public static int[][] generateMatrix(int line, int column) {
        Random random = new Random();
        int[][] matrix = new int[line][column];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = (random.nextInt(19)+1);
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
