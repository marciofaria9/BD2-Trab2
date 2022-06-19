package br.edu.univas.si5.bd2.DAO;

import java.util.Date;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entties.Cliente;
import br.edu.univas.si5.bd2.utils.HibernateUtil;
import br.edu.univas.si5.bd2.view.View;

public class PersisteCliente {
	
	Scanner leitura = new Scanner(System.in);
	
	public void persisteCliente() {
		View view = new View();
		
		Cliente cliente = new Cliente();
		view.informaCliente();
		cliente.setAutoId(leitura.nextInt());
		leitura.nextLine();
		view.informaNome();
		cliente.setNome(leitura.nextLine());
		view.informaNascimento();
		cliente.setNascimento(new Date(leitura.nextLine()));
		
		System.out.println("Código do funcionario: " + cliente.getAutoId());
		
		EntityManager em = HibernateUtil.getEntityManager();

		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		
		PersisteDetalhe detalhe = new PersisteDetalhe();
		detalhe.persisteDetalhe(cliente);
		
		
	}
	
	
}
