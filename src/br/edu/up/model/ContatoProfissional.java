package br.edu.up.model;

import java.text.SimpleDateFormat;

public class ContatoProfissional extends Contato {
  private String cnpj;

  public ContatoProfissional(String nome, String email, Telefone telefone, Anotacao anotacoes, Endereco endereco, String cnpj) {
    super(nome, email, telefone, anotacoes, endereco);
    this.cnpj = cnpj;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

  String dataAnotacao = dateFormat.format(getAnotacao().getData());

  @Override
  public String toString() {
    return String.format("profissional;%s;%s;%s|%s;%s|%s;%s|%s|%s|%s;%s",
        getNome(),
        getEmail(),
        getTelefone().getDdd(),
        getTelefone().getNumero(),
        getAnotacao().getTexto(),
        dataAnotacao,
        getEndereco().getRua(),
        getEndereco().getCidade(),
        getEndereco().getEstado(),
        getEndereco().getCep(),
        getCnpj());
  }
}
