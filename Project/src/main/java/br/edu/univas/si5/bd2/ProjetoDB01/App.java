package br.edu.univas.si5.bd2.ProjetoDB01;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.univas.si5.bd2.entties.Cliente;
import br.edu.univas.si5.bd2.entties.DetalheCliente;
import br.edu.univas.si5.bd2.entties.Pedido;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class App {
	public static void main(String[] args) {

		//persisteCliente();
		 persisteDetalhe();

	}

	public static void persisteCliente() {

		Cliente cliente = new Cliente();
		cliente.setAutoId(7);
		cliente.setNome("Faria");
		cliente.setNascimento(new Date("09/06/1994"));

		System.out.println("Código do funcionario: " + cliente.getAutoId());

		Pedido pedido = new Pedido();
		pedido.setID(58);
		pedido.setData(new Date("18/06/2022"));
		pedido.setValor(19.99);
		pedido.setCliente(cliente);

		EntityManager em = HibernateUtil.getEntityManager();

		em.getTransaction().begin();
		em.persist(cliente);
		em.persist(pedido);
		em.getTransaction().commit();
	}

	public static void persisteDetalhe() {
		
		Cliente cliente = new Cliente();
		cliente.setAutoId(99);
		cliente.setNome("Arrascaeta");
		cliente.setNascimento(new Date("01/06/1994"));
		
		DetalheCliente detalhe = new DetalheCliente();
		detalhe.setCPF(11134);
		detalhe.setRua("AV");
		detalhe.setCliente(cliente);
		detalhe.setBairro("JC");
		detalhe.setNumero(1784);
		detalhe.setCidade("PA");
		detalhe.setTelosUpDt(new Date("18/06/2022"));
		
		EntityManager em = HibernateUtil.getEntityManager();

		em.getTransaction().begin();
		em.persist(cliente);
		em.persist(detalhe);
		em.getTransaction().commit();
		

	}

}
