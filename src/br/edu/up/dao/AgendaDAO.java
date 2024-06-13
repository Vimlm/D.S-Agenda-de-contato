package br.edu.up.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import br.edu.up.model.*;

public class AgendaDAO {
  public static ArrayList<Contato> getContatos(String caminhoCsv) {
    ArrayList<Contato> listaContato = new ArrayList<>();

    File arquivo = new File(caminhoCsv);

    String header = "";

    try (Scanner leitor = new Scanner(arquivo)) {
      header = leitor.nextLine();

      while (leitor.hasNextLine()) {
        String linha = leitor.nextLine();
        String[] dados = linha.split(";");

        String tipoContato = dados[0];
        String nome = dados[1];
        String email = dados[2];

        String telefoneCompleto = dados[3];
        String[] telefoneSplit = telefoneCompleto.split("\\|");
        Telefone telefone = new Telefone(telefoneSplit[0], telefoneSplit[1]);

        String anotacaoCompleta = dados[4];
        String[] anotacoesSplit = anotacaoCompleta.split("\\|");

        Anotacao anotacao = new Anotacao(anotacoesSplit[0],
            new SimpleDateFormat("dd/MM/yyyy").parse(anotacoesSplit[1]));

        String enderecoCompleto = dados[5];
        String[] enderecoSplit = enderecoCompleto.split("\\|");

        Endereco endereco = new Endereco(enderecoSplit[0], enderecoSplit[1], enderecoSplit[2], enderecoSplit[3]);

        if (tipoContato.equals("pessoal")) {

          String aniversario = dados[6];

          ContatoPessoal contatoPessoal = new ContatoPessoal(nome, email, telefone, anotacao, endereco, aniversario);

          listaContato.add(contatoPessoal);
        } else if (tipoContato.equals("profissional")) {

          String cnpj = dados[6];

          ContatoProfissional contatoProfissional = new ContatoProfissional(nome, email, telefone, anotacao, endereco,
              cnpj);

          listaContato.add(contatoProfissional);
        }
      }

    } catch (FileNotFoundException e) {
      System.out.println("Arquivo não encontrado: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Erro ao ler o arquivo: " + e.getMessage());
    }

    return listaContato;
  }

  // Gravar dados no csv
  public static void adicionarContato(Contato contato, String caminhoCsv) {

    File arquivo = new File(caminhoCsv);

    String header = "";

    try (Scanner leitor = new Scanner(arquivo)) {
      header = leitor.nextLine();
    } catch (FileNotFoundException e) {
      System.out.println("Arquivo não encontrado: " + e.getMessage());
    }

    ArrayList<Contato> listaContato = getContatos(caminhoCsv);

    listaContato.add(contato);

    try (PrintWriter escritor = new PrintWriter(arquivo)) {
      escritor.println(header);

      for (Contato c : listaContato) {
        escritor.println(c);
      }

    } catch (FileNotFoundException e) {
      System.out.println("Arquivo não encontrado: " + e.getMessage());
    }
  }

  // Exclur contato do arquivo csv
  public static void excluirContato(String nome, String caminhoCsv) {
    File arquivo = new File(caminhoCsv);

    String header = "";

    try (Scanner leitor = new Scanner(arquivo)) {
      header = leitor.nextLine();
    } catch (FileNotFoundException e) {
      System.out.println("Arquivo não encontrado: " + e.getMessage());
    }

    ArrayList<Contato> listaContato = getContatos(caminhoCsv);

    for (Contato c : listaContato) {
      if (c.getNome().equals(nome)) {
        listaContato.remove(c);
        break;
      }
    }

    try (PrintWriter escritor = new PrintWriter(arquivo)) {
      escritor.println(header);

      for (Contato c : listaContato) {
        escritor.println(c);
      }

    } catch (FileNotFoundException e) {
      System.out.println("Arquivo não encontrado: " + e.getMessage());
    }
  }
}
