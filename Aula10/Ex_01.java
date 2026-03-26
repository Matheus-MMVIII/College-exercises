import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean par = false;
            String pos;

            System.out.println("Digite o numero a ser analisado.");
            int n = sc.nextInt();

            if (n % 2 == 0) {
                par = true;
            }

            if (par) {
                pos = "par";
            }else {
                pos = "ímpar";
            }

            if (n > 0) {
                System.out.println("O numero e "+pos+" é positivo.");
            }else if (n < 0) {
                System.out.println("O numero e "+pos+" é negativo.");
            }else {
                System.out.println("O numero e par é igual a zero.");
            }


        }catch (Exception e) {
            System.out.println("Error: tente colocar apenas numeros.");
        }
    }
}