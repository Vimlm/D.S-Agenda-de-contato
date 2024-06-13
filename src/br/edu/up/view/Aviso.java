package br.edu.up.view;

public class Aviso {
  public static void opcaoInvalida() {
    System.out.println("\nOpção inválida, tente novamente.");
  }

  public static void sair() {
    System.out.println("\nPrograma encerrado.");
  }

  public static void listaVazia() {
    System.out.println("\nLista de contatos vazia.");
  }

  public static void contatoExcluido(String nome) {
    System.out.println("\nContato " + nome + " excluído com sucesso.");
  }

  public static void contatoNaoEncontrado(String nome) {
    System.out.println("\nContato " + nome + " não encontrado.");
  }

  public static void nomeInvalido() {
    System.out.println("\nNome inválido, tente novamente.");
  }
}
