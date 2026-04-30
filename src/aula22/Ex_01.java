package aula22;

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o nome do motorista. ");
            String name = sc.next();
            System.out.println("Digite o numero da CNH do/a " + name);
            int cnh = sc.nextInt();
            System.out.println("Digite o tempo que o/a " + name + " tem de habilitacao em anos. ");
            int yearsDriving = sc.nextInt();
            System.out.println("Digite a placa do veiculo. ");
            String plateVehicle = sc.next();
            System.out.println("Digite o modelo do veiculo. ");
            String modelVehicle = sc.next();
            System.out.println("Digite o ano de fabricacao do carro. ");
            int yearsVehicle = sc.nextInt();
            int endNum = 2;
            int numInfractions = 0;

            do {
                int infractionType = 0;
                int infractionPoints = 0;
                float infractionPrice = 0.0F;
                String infraction = "";
                String situation = "Irregular";
                System.out.println("Digite o qual o numero da infracao:\n1 - Excesso de velocidade\n2 - Estacionamento (Area Azul)\n3 - Alcool ao volante");
                int chose = sc.nextInt();
                String choseName = "";
                switch (chose) {
                    case 1:
                        choseName = "Excesso de velocidade";
                        System.out.println("Digite a velocidade que o/a " + name + " estava. ");
                        float velocityPeople = 0.0F;

                        while((velocityPeople = sc.nextFloat()) < 0.0F) {
                            System.out.println("Velocidade nao pode ser menor do que 0.\nDigite novamente.");
                        }

                        System.out.println("Digite o limite da via. ");
                        float velocityRoad = 0.0F;

                        while((velocityRoad = sc.nextFloat()) < 0.0F) {
                            System.out.println("Velocidade nao pode ser menor do que 0.\nDigite novamente.");
                        }

                        if (velocityPeople > 100.0F) {
                            velocityPeople -= 7.0F;
                        } else if (velocityPeople >= 0.0F) {
                            velocityPeople -= velocityPeople * 7.0F / 100.0F;
                        }

                        if ((double)velocityPeople <= (double)velocityRoad * 1.2) {
                            infractionType = 2;
                            infractionPrice = 130.16F;
                            infractionPoints = 4;
                        } else if ((double)velocityPeople <= (double)velocityRoad * (double)1.5F) {
                            infractionType = 3;
                            infractionPrice = 195.23F;
                            infractionPoints = 5;
                        } else {
                            infractionType = 4;
                            infractionPrice = 880.41F;
                            infractionPoints = 7;
                        }
                        break;
                    case 2:
                        choseName = "Estacionamento (Area Azul)";
                        System.out.println("O motorista fez a ativacao? (1-Sim / 2-Nao) ");
                        boolean activated = false;
                        int active = 0;

                        while((active = sc.nextInt()) != 1 && active != 2) {
                            System.out.println(active);
                        }

                        if (active == 1) {
                            activated = true;
                        } else if (active == 2) {
                            activated = false;
                        }

                        System.out.println("Digite o tempo de permanencia em minutos. ");
                        int time = 0;

                        while((time = sc.nextInt()) < 0) {
                            System.out.println("Tempo nao pode ser menor que 0.\nDigite novamente.");
                        }

                        if (time <= 150) {
                            infractionType = 1;
                            infractionPrice = 88.38F;
                            infractionPoints = 0;
                        } else if (time <= 60) {
                            infractionType = 2;
                            infractionPrice = 130.16F;
                            infractionPoints = 0;
                        } else if (time > 60 || !activated) {
                            infractionType = 3;
                            infractionPrice = 195.23F;
                            infractionPoints = 0;
                        }
                        break;
                    case 3:
                        choseName = "Alcool ao volante";
                        System.out.println("O motorista aceitou a coleta de sangue.");
                        System.out.println("Digite quantidade de alcool no sangue do motorista. (mg/L) ");
                        float bloodAlcohol = 0.0F;

                        while((bloodAlcohol = sc.nextFloat()) < 0.0F) {
                            System.out.println("A quantidade nao pode ser menor que 0.Digite novamente.");
                        }

                        if (bloodAlcohol <= 0.04F) {
                            situation = "Regular";
                        } else if (bloodAlcohol <= 0.33F) {
                            infractionType = 4;
                        } else if (bloodAlcohol >= 0.34F) {
                            infractionType = 5;
                        }

                        infractionPrice = 2934.7F;
                        infractionPoints = 7;
                        break;
                    default:
                        throw new Exception("Opcao de infracao invalida. ");
                }

                ++numInfractions;
                switch (infractionType) {
                    case 0 -> infraction = "nenhuma";
                    case 1 -> infraction = "leve";
                    case 2 -> infraction = "media";
                    case 3 -> infraction = "grave";
                    case 4 -> infraction = "gravissima";
                    case 5 -> infraction = "crime de transito";
                }

                System.out.println("Dados do motorista:\nNome: " + name + "\nCNH: " + cnh + "\nTempo de habilitacao: " + yearsDriving + "\n\nDados do veiculo\nPlaca: " + plateVehicle + "\nModelo: " + modelVehicle + "\nAno de fabricacao: " + yearsVehicle + "\n");
                System.out.println("Infracao:\n" + choseName + ":\nTipo de infracao: " + infraction + "\nValor da multa: " + infractionPrice + "\nPontuacao: " + infractionPoints + "\nSituacao: " + situation + "\n");
                System.out.println("Deseja registrar outra infração? (1-Sim / 2-Não)");
                endNum = sc.nextInt();
            } while(endNum == 1);

            System.out.println("Foram registradas um total de: \nProcessando");

            for(int i = 0; i < 3; ++i) {
                System.out.println(".");
            }

            System.out.println(numInfractions);
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
