package alg.aula28;

import java.util.Scanner;

public class Ex_01 {
    public static String[][] board = new String[8][8];

    public static void main(String[] args) {
        boolean play = true;
        try (Scanner sc = new Scanner(System.in)) {
            generateBoard();
            printBoard();

            while (play) {
        System.out.println("Digite as informacoes da peca a ser mexida. ");
        System.out.print("Linha: ");
                byte startLine = sc.nextByte();
        System.out.print("Coluna: ");
                byte startColumn = sc.nextByte();
        System.out.println("Digite as informacoes do destino da peca. ");
        System.out.print("Linha: ");
                byte endLine = sc.nextByte();
        System.out.print("Coluna: ");
                byte endColumn = sc.nextByte();
                movePiece(startLine, startColumn, endLine, endColumn);
        System.out.println("Deseja continuar? (SIM/NAO)");
                String playText = sc.next();
                if (playText.equalsIgnoreCase("SIM")) {
                    play = true;
                }else if (playText.equalsIgnoreCase("NAO") || playText.equalsIgnoreCase("não")) {
                    play = false;
                }else {
                    throw new IllegalArgumentException("Texto diferente de SIM ou NAO");
                }
            }

        }catch (Exception e) {
      System.out.println("ERROR: "+e.getMessage());
        }
    }

    public static void generateBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i == 0) {
                    switch (j) {
                        case 0, 7 -> board[i][j] = "T";
                        case 1, 6 -> board[i][j] = "C";
                        case 2, 5 -> board[i][j] = "B";
                        case 3 -> board[i][j] = "Q";
                        case 4 -> board[i][j] = "R";
                    }
                }else if (i == 1) {
                    board[i][j] = "P";
                }else if (i == 6) {
                    board[i][j] = "p";
                }else if (i == 7) {
                    switch (j) {
                        case 0, 7 -> board[i][j] = "t";
                        case 1, 6 -> board[i][j] = "c";
                        case 2, 5 -> board[i][j] = "b";
                        case 3 -> board[i][j] = "q";
                        case 4 -> board[i][j] = "r";
                    }
                }else
                    board[i][j] = ".";
            }
        }
    }

    public static void printBoard() {
    System.out.print(" ");
        for (int a = 0; a < board.length; a++) {
      System.out.print(" "+a);
        }
    System.out.println(" ");
        for (int i = 0; i < board.length; i++) {
      System.out.print(i);
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(" "+board[i][j]);
            }
      System.out.println("");
        }
    }

    public static void movePiece(byte startLine, byte startColumn, byte endLine, byte endColumn) {
        if ((startLine < 0 || startColumn < 0 || endLine < 0 || endColumn < 0) && (startLine > 0 || startColumn > 0 || endLine > 0 || endColumn > 0))
            throw new IllegalArgumentException("Tentativa de mover peca fora do tabuleiro. ");

        if (board[startLine][startColumn].equals("."))
            throw new IllegalArgumentException("Tentativa de mover peca inesistente. ");

        if (!(board[endLine][endColumn].equals(".")))
            throw new IllegalArgumentException("Tentativa de mover peca para dentro de outra peca. ");

        String piece = board[startLine][startColumn];

        board[startLine][startColumn] = ".";

        board[endLine][endColumn] = piece;

        printBoard();
    }
}
