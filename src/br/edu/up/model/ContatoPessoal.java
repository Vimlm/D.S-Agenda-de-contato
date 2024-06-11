package br.edu.up.model;

import java.util.ArrayList;

public class ContatoPessoal extends Contato {
  private String aniversario;

  public ContatoPessoal(String nome, String email, Telefone telefone, ArrayList<Anotacoes> anotacoes,
      String aniversario) {
    super(nome, email, telefone, anotacoes);
    this.aniversario = aniversario;
  }

  public String getAniversario() {
    return aniversario;
  }

  public void setAniversario(String aniversario) {
    this.aniversario = aniversario;
  }
}
