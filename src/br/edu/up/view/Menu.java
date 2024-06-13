package br.edu.up.view;

import java.util.Scanner;

public class Menu {
    private static Scanner input = new Scanner(System.in);

    public static int principal() {
        System.out.println("\nMenu Principal:");
        System.out.println("1. Adicionar Contato");
        System.out.println("2. Excluir Contato");
        System.out.println("3. Mostrar Todos os Contatos");
        System.out.println("4. Mostrar Contato por Nome");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        return input.nextInt();
    }

    public static int adicionarContato() {
        System.out.println("\nAdicionar Contato:");
        System.out.println("1. Contato Pessoal");
        System.out.println("2. Contato Profissional");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");
        return input.nextInt();
    }

    public static int excluirContato() {
        System.out.println("\nExcluir Contato:");
        System.out.println("1. Contato Pessoal");
        System.out.println("2. Contato Profissional");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");
        return input.nextInt();
    }

    public static String mostrarContato() {
        System.out.print("Informe o nome do contato: ");
        return input.next();
    }
}
