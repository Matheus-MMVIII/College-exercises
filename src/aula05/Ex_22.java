package aula05;

import java.util.Scanner;

public class Ex_22 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite a largura da parede em cm: ");
            int wallWidth = sc.nextInt();
            
            System.out.print("Digite a altura da parede em cm: ");
            int wallHeight = sc.nextInt();
            
            System.out.print("Digite a largura do azulejo em cm: ");
            int tileWidth = sc.nextInt();
            
            System.out.print("Digite a altura do azulejo em cm: ");
            int tileHeight = sc.nextInt();

            int numY = (wallHeight / tileHeight);
            int numX = (wallWidth / tileWidth);

            if (wallHeight > 0 && wallWidth > 0 && tileHeight > 0 && tileWidth > 0) {
                if (wallHeight % tileHeight != 0)
                    numY++;

                if (wallWidth % tileWidth != 0)
                    numY++;
                System.out.println("A quantidade de azulejos deve ser de: " + (numY * numX)); 
            }else {
                System.out.println("Error: tente colocar apenas valores positivos.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: tente colocar um numero.");
        }
    }
}
