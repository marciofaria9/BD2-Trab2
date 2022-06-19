package br.edu.univas.si5.bd2.ProjetoDB01;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.univas.si5.bd2.DAO.PersisteCliente;
import br.edu.univas.si5.bd2.DAO.PersisteDetalhe;
import br.edu.univas.si5.bd2.DAO.PersistePedido;
import br.edu.univas.si5.bd2.entties.Cliente;
import br.edu.univas.si5.bd2.entties.DetalheCliente;
import br.edu.univas.si5.bd2.entties.Pedido;
import br.edu.univas.si5.bd2.utils.HibernateUtil;
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

		PersisteCliente cliente = new PersisteCliente();
		PersisteDetalhe detalhe = new PersisteDetalhe();
		PersistePedido pedido = new PersistePedido();

		Scanner leitura = new Scanner(System.in);
		View view = new View();
		view.menuInicial();
		int escolha = readInt(leitura);

		if (escolha == 1) {

			cliente.persisteCliente();

		}

		else if (escolha == 2) {

			pedido.persistePedido();

		}

	}

	public int readInt(Scanner leitura) {

		int i = leitura.nextInt();
		leitura.nextLine();

		return i;
	}

}
