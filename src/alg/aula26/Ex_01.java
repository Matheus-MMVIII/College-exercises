package alg.aula26;

import java.util.Scanner;

public class Ex_01 {
    public static int tamanhoVetoresLivros = 100;
    public static int tamanhoVetoresUsuarios = 60;
    public int totalLivros = 0;
    public int totalUsuarios = 0;

    public int[] ids = new int[tamanhoVetoresLivros];
    public String[] titulos = new String[tamanhoVetoresLivros];
    public String[] autores = new String[tamanhoVetoresLivros];
    public String[] generos = new String[tamanhoVetoresLivros];
    public double[] precos = new double[tamanhoVetoresLivros];
    public int[] quantidades = new int[tamanhoVetoresLivros];
    public boolean[] ehRaros = new boolean[tamanhoVetoresLivros];

    public int[] usuarioIds = new int[tamanhoVetoresUsuarios];
    public String[] usuarioNomes = new String[tamanhoVetoresUsuarios];
    public String[] usuarioEmails = new String[tamanhoVetoresUsuarios];
    public boolean[] ehAtivos = new boolean[tamanhoVetoresUsuarios];
    public int[] livrosEmprestados = new int[tamanhoVetoresUsuarios];

    public void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int func = 0;
            while (true) {
                System.out.println("\nFuncionalidades:\n" +
                        "1 - Cadastrar livro\n" +
                        "2 - Cadastrar usuario\n" +
                        "3 - Listar todos os livros\n" +
                        "4 - Pesquisar por genero\n" +
                        "5 - Relatorio de acervo baixo\n" +
                        "6 - Listar usuarios ativos\n" +
                        "7 - Valor total do acervo\n" +
                        "0 - Sair");
                func = sc.nextInt();
                if (func == 0) {
          System.out.println("Programa finalizado. ");
                    break;
                }
                switch (func) {
                    case 1 -> {
                        if (tamanhoVetoresLivros == totalLivros) {
                            System.out.println("ERROR: Vetores de livros ja estao cheios. ");
                            break;
                        }
                        System.out.println("Digite o id do livro.");
                        int id = sc.nextInt();
                        System.out.println("Digite o nome do livro. ");
                        String nome = sc.next();
                        System.out.println("Digite o autor/a do livro. ");
                        String autor = sc.next();
                        System.out.println("Digite o genero do livro. ");
                        String genero = sc.next();
                        System.out.println("Digite o preco do livro. ");
                        double preco = sc.nextDouble();
                        if (preco < 0.0D) {
                            System.out.println("ERROR: Preco do livro nao pode ser negativo. ");
                            break;
                        }
                        System.out.println("Digite a quantidade de livros disponiveis no acervo. ");
                        int quantidade = sc.nextInt();
                        if (quantidade < 0) {
                            System.out.println("ERROR: Quantidade de livros nao pode ser negativo. ");
                            break;
                        }
                        System.out.println("Digite se o livro e raro (SIM/NAO)");
                        boolean ehRaro = false;
                        String raroTexto = sc.next();
                        if (raroTexto.equalsIgnoreCase("SIM")) {
                            ehRaro = true;
                        }else if (raroTexto.equalsIgnoreCase("NAO") || raroTexto.equalsIgnoreCase("não")) {
                            ehRaro = false;
                        }else {
                            System.out.println("ERROR: Texto diferente de SIM ou NAO");
                            break;
                        }

                        ids[totalLivros] = id;
                        titulos[totalLivros] = nome;
                        autores[totalLivros] = autor;
                        generos[totalLivros] = genero;
                        precos[totalLivros] = preco;
                        quantidades[totalLivros] = quantidade;
                        ehRaros[totalLivros] = ehRaro;
                        totalLivros++;
                        System.out.println("Livro cadastrado com sucesso. ");
                    }
                    case 2 -> {
                        if (tamanhoVetoresUsuarios == totalUsuarios) {
                            System.out.println("ERROR: Vetores de usuarios ja estao cheios. ");
                            break;
                        }
                        System.out.println("Digite o id do usuario.");
                        int id = sc.nextInt();
                        System.out.println("Digite o nome do usuario. ");
                        String nome = sc.next();
                        System.out.println("Digite o email do usuario. ");
                        String email = sc.next();
                        boolean ehAtivo = true;
                        int quantidade = 0;

                        usuarioIds[totalUsuarios] = id;
                        usuarioNomes[totalUsuarios] = nome;
                        usuarioEmails[totalUsuarios] = email;
                        livrosEmprestados[totalUsuarios] = quantidade;
                        ehAtivos[totalUsuarios] = ehAtivo;
                        totalUsuarios++;
                        System.out.println("Usuario cadastrado com sucesso. ");
                    }
                    case 3 -> {
                        if (totalLivros == 0) {
                            System.out.println("ERROR: Nao a livros cadastrados. ");
                            break;
                        }

                        for (int i = 0; totalLivros > i; i++) {
                            print(i, true);
                        }
                    }
                    case 4 -> {
                        if (totalLivros == 0) {
                            System.out.println("ERROR: Nao a livros cadastrados. ");
                            break;
                        }
                        System.out.println("Digite o genero a pesquisar. ");
                        String genero = sc.next();
                        boolean temLivro = false;

                        for (int i = 0; totalLivros > i; i++) {
                            if (generos[i].equalsIgnoreCase(genero)) {
                                temLivro = true;
                                print(i, true);
                            }
                        }
                        if (!temLivro)
                            System.out.println("ERROR: Livro desse genero nao encontrado. ");

                    }
                    case 5 -> {
                        if (totalLivros == 0) {
                            System.out.println("ERROR: Nao a livros cadastrados. ");
                            break;
                        }
                        boolean temLivro = false;

                        for (int i = 0; totalLivros > i; i++) {
                            if (quantidades[i] < 3) {
                                temLivro = true;
                                System.out.println(
                                        (i + 1)
                                                + " - Livro"
                                                + "\nTitulo: "
                                                + titulos[i]
                                                + "\nAutor: "
                                                + autores[i]
                                                + "\nQuantidade: "
                                                + quantidades[i]);
                            }
                        }
                        if (!temLivro)
                            System.out.println("ERROR: Livros com baixo estoque nao encontrados. ");
                    }
                    case 6 -> {
                        if (totalUsuarios == 0) {
                            System.out.println("ERROR: Nao a usuarios cadastrados. ");
                            break;
                        }

                        for (int i = 0; totalUsuarios > i; i++) {
                            print(i, false);
                        }
                    }
                    case 7 -> {
                        if (totalLivros == 0) {
                            System.out.println("ERROR: Nao a livros cadastrados. ");
                            break;
                        }

                        for (int i = 0; totalLivros > i; i++) {
                            System.out.println("Total investido no livro "+(i+1)+": "+(precos[i]*quantidades[i]));
                        }
                    }
                }
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void print(int i, boolean showBooks) {
        if (showBooks) {
            System.out.println(
                    (i + 1)
                            + " - Livro"
                            + "\nID: "
                            + ids[i]
                            + "\nTitulo: "
                            + titulos[i]
                            + "\nAutor: "
                            + autores[i]
                            + "\nGenero: "
                            + generos[i]
                            + "\nPreco: "
                            + precos[i]
                            + "\nQuantidade: "
                            + quantidades[i]
                            + "\nRaro: "
                            + (ehRaros[i] ? "Sim" : "Não"));
        } else {
            System.out.println(
                            "ID:"
                            + usuarioIds[i]
                            + "\nNome: "
                            + usuarioNomes[i]
                            + "\nEmail: "
                            + usuarioEmails[i]
                            + "\nAtivo: "
                            + (ehAtivos[i] ? "Sim" : "Não")
                            + "\nLivros emprestados: "
                            + livrosEmprestados[i]);
        }
    }
}
