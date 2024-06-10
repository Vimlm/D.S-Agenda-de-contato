package br.edu.up.model;
import java.util.ArrayList;

public class ContatoProfissional extends Contato {
  private String cnpj;

  public ContatoProfissional(String nome, String email, Telefone telefone, ArrayList<Anotacoes> anotacoes, String cnpj) {
    super(nome, email, telefone, anotacoes);
    this.cnpj = cnpj;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }
}