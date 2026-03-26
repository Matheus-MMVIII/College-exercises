import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String situacao;

            System.out.println("Digite a primeira nota.");
            float n1 = sc.nextFloat();

            System.out.println("Digite a segunda nota.");
            float n2 = sc.nextFloat();

            float media = (n1 + n2) / 2;

            if (media >= 7) {
                situacao = "Aprovado";
            }else if (media >= 5) {
                situacao = "Em recuperação";
            }else {
                situacao = "Reprovado";
            }

            System.out.printf("A média do aluno foi %f e sua situação é %s.", media, situacao);

        }catch (Exception e) {
            System.out.println("Error: tente colocar apenas numeros.");
        }
    }
}