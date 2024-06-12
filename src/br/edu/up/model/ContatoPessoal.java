package br.edu.up.model;

import java.util.ArrayList;

public class ContatoPessoal extends Contato {
  private String aniversario;

  public ContatoPessoal(String nome, String email, Telefone telefone, ArrayList<Anotacoes> anotacoes, Endereco endereco,
      String aniversario) {
    super(nome, email, telefone, anotacoes, endereco);
    this.aniversario = aniversario;
  }

  public String getAniversario() {
    return aniversario;
  }

  public void setAniversario(String aniversario) {
    this.aniversario = aniversario;
  }

  @Override
  public String toString() {
    return "ContatoPessoal{" +
      "nome='" + getNome() + '\'' +
      ", email='" + getEmail() + '\'' +
      ", telefone=" + getTelefone() +
      ", anotacoes=" + getAnotacoes() +
      ", endereco=" + getEndereco() +
      ", aniversario='" + aniversario + '\'' +
      '}';
  }
}
