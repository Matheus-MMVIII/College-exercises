import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite a sua idade.");
            int idade = sc.nextInt();

            if (idade < 0 || idade > 100) {
                System.out.println("Error: idade digitada é inválida.");
            }else if (idade <= 12) {
                System.out.println("A classificação do indivíduo é de Criança.");
            }else if (idade <= 17) {
                System.out.println("A classificação do indivíduo é de Adolecente.");
            }else if (idade <= 59) {
                System.out.println("A classificação do indivíduo é de Adulto.");
            }else {
                System.out.println("A classificação do indivíduo é de Idoso.");
            }

        }catch (Exception e) {
            System.out.println("Error: tente colocar apenas numeros.");
        }
    }
}