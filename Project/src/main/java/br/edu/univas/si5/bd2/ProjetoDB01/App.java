package br.edu.univas.si5.bd2.ProjetoDB01;

import java.util.Scanner;

import br.edu.univas.si5.bd2.DAO.Delete;
import br.edu.univas.si5.bd2.DAO.Find;
import br.edu.univas.si5.bd2.DAO.PersisteCliente;
import br.edu.univas.si5.bd2.DAO.PersisteDetalhe;
import br.edu.univas.si5.bd2.DAO.PersistePedido;
import br.edu.univas.si5.bd2.view.View;

public class App {
	public static void main(String[] args) {

		App app = new App();
		app.initialize();

	}

	public void initialize() {

		menu();

	}

	public void menu() {

		Scanner leitura = new Scanner(System.in);

		PersisteCliente cliente = new PersisteCliente();
		PersisteDetalhe detalhe = new PersisteDetalhe();
		PersistePedido pedido = new PersistePedido();
		Find find = new Find();
		Delete delete = new Delete();

		View view = new View();
		int escolha = 999;

		do {
			view.menuInicial();

			escolha = readInt(leitura);

			if (escolha == 1) {

				cliente.persisteCliente();

			}

			else if (escolha == 2) {

				pedido.persistePedido();
			}

			else if (escolha == 3) {

				find.findCliente();

			}

			else if (escolha == 4) {

				find.findPedido();

			}
			
			else if (escolha == 5) {

				delete.removeCliente();
			}
   
			else if (escolha == 6) {

				delete.removePedido();
			}
			
			
		} while (escolha != 0);

		view.sair();

	}

	public int readInt(Scanner leitura) {

		int i = leitura.nextInt();
		leitura.nextLine();

		return i;
	}

}
