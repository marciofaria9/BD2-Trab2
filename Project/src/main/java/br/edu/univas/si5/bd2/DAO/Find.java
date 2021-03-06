package br.edu.univas.si5.bd2.DAO;

import java.util.Scanner;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entties.Cliente;
import br.edu.univas.si5.bd2.entties.Pedido;
import br.edu.univas.si5.bd2.utils.HibernateUtil;
import br.edu.univas.si5.bd2.view.View;

public class Find {
	View view = new View();

	Scanner leitura;
	private EntityManager em = HibernateUtil.getEntityManager();

	public void findCliente() {

		view.informaAutoId();
		leitura = new Scanner(System.in);
		int PK = leitura.nextInt();
		leitura.nextLine();
		Cliente cliente = em.find(Cliente.class, PK);
		System.out.println("Cliente: " + cliente);

	}

	public void findPedido() {
		view.informaID();
		leitura = new Scanner(System.in);
		int PK = leitura.nextInt();
		leitura.nextLine();
		Pedido pedido = em.find(Pedido.class, PK);
		System.out.println("Pedido: " + pedido);
	}

}
