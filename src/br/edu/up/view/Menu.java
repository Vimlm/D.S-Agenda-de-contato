package br.edu.up.view;

import br.edu.up.model.Console;

public class Menu {
  public static int principal() {
    System.out.println("\n-----------Agenda de Contato-----------");
    System.out.println("1- Adicionar Contato");
    System.out.println("2- Excluir Contato");
    System.out.println("3- Mostrar Todos Contatos");
    System.out.println("4- Mostrar Somente um Contato");
    System.out.println("0- Sair");

    return Console.readInt("\nInforme a opção: ");
  }

  public static int adicionarContato() {
    System.out.println("\n-----------Menu adicionar contato-----------");
    System.out.println("1- Adicionar contato pessoal");
    System.out.println("2- Adicionar contato comercial");
    System.out.println("0- Voltar");

    return Console.readInt("\nInforme a opção: ");
  }

  public static int excluirContato() {
    System.out.println("\n-----------Menu excluir contato-----------");
    System.out.println("1- Excluir contato pessoal");
    System.out.println("2- Excluir contato comercial");
    System.out.println("0- Voltar");

    return Console.readInt("\nInforme a opção: ");
  }

  public static String mostrarContato() {
    System.out.println("\n-----------Mostrar Somente Um Contato-----------");

    return Console.readString("\nInforme o nome do contato que deseja mostrar: ");
  }
  
}