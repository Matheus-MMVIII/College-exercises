package aula25;

import java.util.Scanner;

public class Ex_01 {
    public static int tamanhoVetores = 50;
    public int totalProdutos = 0;

    public int[] ids = new int[tamanhoVetores];
    public String[] nomes = new String[tamanhoVetores];
    public String[] categorias = new String[tamanhoVetores];
    public double[] precos = new double[tamanhoVetores];
    public int[] quantidades = new int[tamanhoVetores];
    public boolean[] ehPerecivel = new boolean[tamanhoVetores];

    public void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int func = 0;
            while (true) {
        System.out.println("Funcionalidades:\n" +
                "1 - Cadastrar produto\n" +
                "2 - Listar todos os produtos\n" +
                "3 - Pesquisar por categoria\n" +
                "4 - Relatorio de estoque baixo\n" +
                "5 - Balanco patrimonial\n" +
                "0 - Sair");
            func = sc.nextInt();
            if (func == 0)
                break;
            switch (func) {
                case 1 -> {
                    if (tamanhoVetores == totalProdutos) {
              System.out.println("ERROR: Vetores ja estao cheios. ");
              break;
                    }
            System.out.println("Digite o id do produto.");
                    int id = sc.nextInt();
            System.out.println("Digite o nome do produto. ");
                    String nome = sc.next();
            System.out.println("Digite a categoria do produto. ");
                    String categoria = sc.next();
            System.out.println("Digite o preco do produto. ");
                    double preco = sc.nextDouble();
                    if (preco < 0.0D) {
              System.out.println("ERROR: Preco do produto nao pode ser negativo. ");
              break;
                    }
            System.out.println("Digite a quantidade de produtos. ");
                    int quantidade = sc.nextInt();
                    if (quantidade < 0) {
              System.out.println("ERROR: Quantidade do produto nao pode ser negativo. ");
                        break;
                    }
            System.out.println("Digite se o produto e perecivel ou nao (SIM/NAO)");
                    boolean perecivel = false;
                    String perecivelTexto = sc.next();
                    if (perecivelTexto.equalsIgnoreCase("SIM")) {
                        perecivel = true;
                    }else if (perecivelTexto.equalsIgnoreCase("NAO") || perecivelTexto.equalsIgnoreCase("não")) {
                        perecivel = false;
                    }else {
              System.out.println("ERROR: Texto diferente de SIM ou NAO");
                        break;
                    }

                    ids[totalProdutos] = id;
                    nomes[totalProdutos] = nome;
                    categorias[totalProdutos] = categoria;
                    precos[totalProdutos] = preco;
                    quantidades[totalProdutos] = quantidade;
                    totalProdutos++;
            System.out.println("Produto cadastrado com sucesso. ");
                }
                case 2 -> {
                    if (totalProdutos == 0) {
              System.out.println("ERROR: Nao a produtos cadastrados. ");
                    break;
                    }

                    for (int i = 0; totalProdutos > i; i++) {
                        printProduct(i, true);
                    }
                }
                case 3 -> {
                if (totalProdutos == 0) {
              System.out.println("ERROR: Nao a produtos cadastrados. ");
                    break;
                }
            System.out.println("Digite a categoria a pesquisar. ");
                    String categoria = sc.next();
                    boolean temProduto = false;

                    for (int i = 0; totalProdutos > i; i++) {
                        if (categorias[i].equalsIgnoreCase(categoria)) {
                            temProduto = true;
                            printProduct(i, true);
                        }
                    }
                    if (!temProduto)
              System.out.println("ERROR: Prouto dessa categoria nao encontrado. ");

                }
                case 4 -> {
                    if (totalProdutos == 0) {
                        System.out.println("ERROR: Nao a produtos cadastrados. ");
                        break;
                    }
                    boolean temProduto = false;

                    for (int i = 0; totalProdutos > i; i++) {
                        if (quantidades[i] <= 5) {
                            temProduto = true;
                            printProduct(i, false);
                        }
                    }
                    if (!temProduto)
                        System.out.println("ERROR: Prouto com baixo estoque nao encontrado. ");
                }
                case 5 -> {
                    if (totalProdutos == 0) {
                        System.out.println("ERROR: Nao a produtos cadastrados. ");
                        break;
                    }

                    for (int i = 0; totalProdutos > i; i++) {
              System.out.println("Total investido no produto "+(i+1)+": "+(precos[i]*quantidades[i]));
                    }
                }
            }
            }
        }catch (Exception e) {
      System.out.println(e.getMessage());
        }
    }

    public void printProduct(int i, boolean mostrarTudo) {
    if (mostrarTudo) {
      System.out.println(
          (i + 1)
              + " - Produto"
              + "\nID: "
              + ids[i]
              + "\nNome: "
              + nomes[i]
              + "\nCategoria: "
              + categorias[i]
              + "\nPreco: "
              + precos[i]
              + "\nQuantidade: "
              + quantidades[i]
              + "\nPerecivel: "
              + (ehPerecivel[i] ? "Não" : "Sim"));
    } else {
      System.out.println(
              "Nome: "
              + nomes[i]
              + "\nCategoria: "
              + categorias[i]
              + "\nPreco: "
              + precos[i]
              + "\nQuantidade: "
              + quantidades[i]);
        }
    }
}
