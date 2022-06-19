package br.edu.univas.si5.bd2.DAO;

import java.util.Scanner;
import java.util.Set;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entties.Cliente;
import br.edu.univas.si5.bd2.entties.DetalheCliente;
import br.edu.univas.si5.bd2.entties.Pedido;
import br.edu.univas.si5.bd2.utils.HibernateUtil;
import br.edu.univas.si5.bd2.view.View;

public class Delete {
	View view = new View();

	public void removeCliente() {

		Scanner leitura = new Scanner(System.in);
		EntityManager em = HibernateUtil.getEntityManager();

		view.informaAutoId();
		int ID = leitura.nextInt();
		leitura.nextLine();
		Cliente cliente = em.find(Cliente.class, ID);

		if (cliente != null) {

			view.alertaCPF();
			int CPF = leitura.nextInt();
			leitura.nextLine();
			DetalheCliente detalhe = em.find(DetalheCliente.class, CPF);
			Set<Pedido> pedido = cliente.getPedidos();

			em.getTransaction().begin();
			if (pedido != null) {
				for (Pedido pedidos : pedido) {
					em.remove(pedidos);
				}

				if (detalhe != null) {
					em.remove(detalhe);
				}

				em.remove(cliente);
				em.getTransaction().commit();
				view.removido();

			} else {
				view.naoEncontrado();
			}

		}

	}

	public void removePedido() {

		Scanner leitura = new Scanner(System.in);
		EntityManager em = HibernateUtil.getEntityManager();
		view.informaID();
		int ID = leitura.nextInt();
		leitura.nextLine();

		Pedido pedido = em.find(Pedido.class, ID);

		if (pedido != null) {
			em.getTransaction().begin();
			em.remove(pedido);
			em.getTransaction().commit();
			view.removido();

		}

		else {
			view.naoEncontrado();
		}
	}

}
