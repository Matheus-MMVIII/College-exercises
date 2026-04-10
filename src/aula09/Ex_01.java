package aula09;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            Double c = 0D;
            Double a = 0D;
            Double b = 0D;

            //Equação que tem que resolver 1600 = -2t² + 120t
            System.out.printf("Digite o 1º número da equação %.0f = -%.0f * t² + %.0f * t: ", c, a, b);
            c = sc.nextDouble();
            
            System.out.printf("Digite o 2º número da equação %.0f = -%.0f * t² + %.0f * t: ", c, a, b);
            a = sc.nextDouble();
            
            System.out.printf("Digite o 3º número da equação %.0f = -%.0f * t² + %.0f * t: ", c, a, b);
            b = sc.nextDouble();
            
            System.out.println("Equação: ");//a = -2, b = 120, c = -1600, delta = 1600
            System.out.printf("%.0f = -%.0f * t² + %.0f * t: \n", c, a, b);
            System.out.printf("Δ = %.0f² - 4 * (-%.0f) * (-%.0f): \n", b, a, c);
            System.out.printf("Δ = %.0f - 4 * %.0f: \n", Math.pow(b, 2), (a * c));
            System.out.printf("Δ = %.0f - %.0f: \n", Math.pow(b, 2), ((a * c)*4));
            System.out.printf("Δ = %.0f: \n", (Math.pow(b, 2) - ((a * c)*4)));
            System.out.printf("t = -%.0f +- √%.0f / 2 * (-%.0f): \n", b, (Math.pow(b, 2) - ((a * c)*4)), a);
            System.out.printf("t = -%.0f +- %.0f / (-%.0f): \n", b, Math.sqrt((Math.pow(b, 2) - ((a * c)*4))), (a*2));
            System.out.printf("t' = -%.0f + %.0f / (-%.0f): \n", b, Math.sqrt((Math.pow(b, 2) - ((a * c)*4))), (a*2));
            System.out.printf("t' = %.0f / (-%.0f): \n", (Math.sqrt((Math.pow(b, 2) - ((a * c)*4))) - b), (a*2));
            System.out.printf("t' = %.0f: \n", ((Math.sqrt((Math.pow(b, 2) - ((a * c)*4))) - b) / -(a*2)));
            System.out.printf("t'' = -%.0f - %.0f / (-%.0f): \n", b, Math.sqrt((Math.pow(b, 2) - ((a * c)*4))), (a*2));
            System.out.printf("t'' = -%.0f / (-%.0f): \n", (b + Math.sqrt((Math.pow(b, 2) - ((a * c)*4)))), (a*2));
            System.out.printf("t'' = %.0f: \n", (b + Math.sqrt((Math.pow(b, 2) - ((a * c)*4)))) / (a*2));


        }catch (Exception e) {
            System.out.println("Error: tente colocar apenas numeros.");
        }
    }

    public static int calcDelta(int a, int b, int c) {//prof n deixou usar
        int x = (int)Math.round(Math.pow(b, 2)) - 4 * a * c;
        return x;
    }
}