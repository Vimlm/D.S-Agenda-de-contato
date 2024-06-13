package br.edu.up.model;
import java.util.Date;
import java.text.SimpleDateFormat;


// Classe criada por: Camile, ajuda com o código: Victor //
public class Anotacao {
  private String texto;
  private Date data;

  SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

  public Anotacao() {
  }

  public Anotacao(String texto, Date data) {
    this.texto = texto;
    this.data = data;
  }

  public Anotacao(String texto) {
    this.texto = texto;
    this.data = new Date();
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

  //get data formatada
  public String getDataFormatada() {
    return dateFormat.format(data);
  }
}