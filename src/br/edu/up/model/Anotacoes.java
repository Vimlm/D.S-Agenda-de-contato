package br.edu.up.model;
import java.util.Date;

public class Anotacoes {
  private String texto;
  private Date data;

  public Anotacoes(String texto, Date data) {
    this.texto = texto;
    this.data = data;
  }

  public String getTexto() {
    return texto;
  }

  public void setTexto(String texto) {
    this.texto = texto;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }
}
