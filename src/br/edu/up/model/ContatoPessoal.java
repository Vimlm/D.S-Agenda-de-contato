package br.edu.up.model;

import java.text.SimpleDateFormat;

public class ContatoPessoal extends Contato {
  private String aniversario;

  public ContatoPessoal(String nome, String email, Telefone telefone, Anotacao anotacoes, Endereco endereco,
      String aniverssario) {
    super(nome, email, telefone, anotacoes, endereco);
    this.aniversario = aniverssario;
  }

  public String getAniversario() {
    return aniversario;
  }

  public void setAniversario(String aniversario) {
    this.aniversario = aniversario;
  }

  SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

  String dataAnotacao = dateFormat.format(getAnotacao().getData());

  @Override
  public String toString() {
    return String.format("pessoal;%s;%s;%s|%s;%s|%s;%s|%s|%s|%s;%s",
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
        getAniversario());
  }

}
