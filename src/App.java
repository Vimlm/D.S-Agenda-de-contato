import br.edu.up.view.Menu;
import br.edu.up.view.Aviso;

public class App {
  public static void main(String[] args) throws Exception {
    int opcao;

    do {
      opcao = Menu.principal();

      switch (opcao) {
        case 1:
          int opcaoAdicionar;

          do {
            opcaoAdicionar = Menu.adicionarContato();

            switch (opcaoAdicionar) {
              case 1:
                // Adicionar Contato Pessoal
                break;

              case 2:
                // Adicionar Contato Comercial
                break;

              default:
                Aviso.opcaoInvalida();
                break;
            }

          } while (opcaoAdicionar != 0);
          break;

        case 2:
          int opcaoExcluir;

          do {
            opcaoExcluir = Menu.excluirContato();

            switch (opcaoExcluir) {
              case 1:
                // Excluir Contato Pessoal
                break;

              case 2:
                // Excluir Contato Comercial
                break;

              default:
                break;
            }
          } while (opcaoExcluir != 0);
          break;

        case 3:
          // Mostrar Todos Os Contatos
          break;

        case 4:
          String contato = Menu.mostrarContato();

          // Pesquisar contato na base e mostrar o contato pesquisado.
          break;

        case 0:
          Aviso.sair();
          break;

        default:
          Aviso.opcaoInvalida();
          break;
      }

    } while (opcao != 0);
  }
}
