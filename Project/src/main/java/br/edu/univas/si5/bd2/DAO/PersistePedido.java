package br.edu.univas.si5.bd2.DAO;

import java.util.Date;
import java.util.Scanner;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entties.Cliente;
import br.edu.univas.si5.bd2.entties.Pedido;
import br.edu.univas.si5.bd2.utils.HibernateUtil;
import br.edu.univas.si5.bd2.view.View;

public class PersistePedido {

	Scanner leitura = new Scanner(System.in);

	public void persistePedido() {
		View view = new View();

		EntityManager em = HibernateUtil.getEntityManager();

		view.informaFK();
		Cliente cliente = em.find(Cliente.class, leitura.nextInt());
		leitura.nextLine();
		if (cliente == null) {
			System.out.println(cliente + "é null");
			leitura.close();
			return;
		}

		Pedido pedido = new Pedido();
		view.informaID();
		pedido.setID(leitura.nextInt());
		pedido.setData(new Date());
		view.informaValor();
		pedido.setValor(leitura.nextDouble());
		leitura.nextLine();
		pedido.setCliente(cliente);

		em.getTransaction().begin();
		em.persist(pedido);
		em.getTransaction().commit();

	}
}
