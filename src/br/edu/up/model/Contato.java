package br.edu.up.model;

public class Contato {
    private String nome;
    private String email;
    private Telefone telefone;
    private Anotacao anotacoes;
    private Endereco endereco;

    public Contato(String nome, String email, Telefone telefone, Anotacao anotacoes, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.anotacoes = anotacoes;
        this.endereco = endereco;
    }

    public Contato() {
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

    public Anotacao getAnotacao() {
        return anotacoes;
    }

    public void setAnotacoes(Anotacao anotacoes) {
        this.anotacoes = anotacoes;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone=" + telefone +
                ", anotacoes=" + anotacoes +
                ", endereco=" + endereco +
                '}';
    }
}
