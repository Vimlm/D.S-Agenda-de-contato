package br.edu.up.model;

public class Contato {
  private String nome;
  private String email;
  private Telefone telefone;
  private ArrayList<Anotacoes> anotacoes;

  public Contato(String nome, String email, Telefone telefone, ArrayList<Anotacoes> anotacoes) {
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
    this.anotacoes = anotacoes;
  }
  
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Telefone getTelefone() {
    return telefone;
  }

  public void setTelefone(Telefone telefone) {
    this.telefone = telefone;
  }

  public ArrayList<Anotacoes> getAnotacoes() {
    return anotacoes;
  }

  public void setAnotacoes(ArrayList<Anotacoes> anotacoes) {
    this.anotacoes = anotacoes;
  }
}
