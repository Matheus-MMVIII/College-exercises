package poo.aula09_29_09.ex_01;

public class Main {
    public static void main(String[] args) {
        double[] array = new double[5];
        try {
            System.out.println(array[8]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Tentativa de acessar index maior que o tamanho do array. ");
        } finally {
            System.out.println("Processamento de notas finalizado. ");
        }
    }
}
