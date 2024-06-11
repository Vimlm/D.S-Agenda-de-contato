package br.edu.up.model;

import java.util.ArrayList;
import java.util.List; 

public class Grupo {
    //Attributes
    private String nome;
    private List<Contato> contatos;
    private List<String> mensagens;

    //Constructor
    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList<>();
        this.mensagens = new ArrayList<>();
    }

    //Methods
    public void adicionarContato(Contato contato) {
        this.contatos.add(contato);
    }

    public void removerContato(Contato contato) {
        this.contatos.remove(contato);
    }
    
    public void adicionarMensagem(String mensagem) {
        this.mensagens.add(mensagem);
    }

    public List<Contato> listarContatos() {
        return this.contatos;
    }

    public List<String> listarMensagens() {
        return this.mensagens;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "nome='" + nome + '\'' +
                ", contatos=" + contatos +
                ", mensagens=" + mensagens +
                '}';
    }
}
