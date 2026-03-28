import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int condition = 0;
            int conditionPAS;
            int conditionPain;

            String cond = "";

            System.out.println("Digite o PAS do paciente. ");
            int PAS = sc.nextInt();
            System.out.println("Digite o valor da dor relatado.");
            int pain = sc.nextInt();

            if (PAS>=90 && PAS<=140) {
                conditionPAS = 2;
            }else if (PAS>140 && PAS<180) {
                conditionPAS = 1;
            }else {
                conditionPAS = 3;
            }

            if (pain <= 3) {
                conditionPain = 1;
            }else if (pain >= 8) {
                conditionPain = 3;
            }else {
                conditionPain = 2;
            }

            if (conditionPAS == 1 && conditionPain == 1 || conditionPAS == 2 && conditionPain == 1) {
                condition = 1;
            }else if (conditionPAS == 1 && conditionPain == 2 || conditionPAS == 2 && conditionPain == 2) {
                condition = 2;
            }else if (conditionPAS == 1 && conditionPain == 3 || conditionPAS == 2 && conditionPain == 3 || conditionPAS == 3 && conditionPain == 1) {
                condition = 3;
            }else if (conditionPAS == 3 && conditionPain == 2 || conditionPAS == 3 && conditionPain == 3) {
                condition = 4;
            }

            switch(condition) {
                case 1 -> cond = "Não urgente";
                case 2 -> cond = "Pouco urgente";
                case 3 -> cond = "Urgência";
                case 4 -> cond = "Emergência";
                default -> System.out.println("Error: condição não encontrada");
            }

            System.out.println("A condição do usúario é de: "+cond);

            sc.close();
        }catch (Exception e) {
            System.out.println("Error: tente apenas numeros.");
        }
    }
}