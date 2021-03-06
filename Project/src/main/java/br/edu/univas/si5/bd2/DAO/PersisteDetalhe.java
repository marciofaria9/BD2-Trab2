package br.edu.univas.si5.bd2.DAO;

import java.util.Date;
import java.util.Scanner;

import javax.persistence.EntityManager;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import br.edu.univas.si5.bd2.entties.Cliente;
import br.edu.univas.si5.bd2.entties.DetalheCliente;
import br.edu.univas.si5.bd2.utils.HibernateUtil;
import br.edu.univas.si5.bd2.view.View;

public class PersisteDetalhe {

	Scanner leitura = new Scanner(System.in);

	public void persisteDetalhe(Cliente cliente) {

		View view = new View();
		DetalheCliente detalhe = new DetalheCliente();

		view.informaCPF();
		detalhe.setCPF(leitura.nextInt());
		leitura.nextLine();
		view.informaRua();
		detalhe.setRua(leitura.nextLine());
		detalhe.setCliente(cliente);
		view.informaBairro();
		detalhe.setBairro(leitura.nextLine());
		view.informaNumero();
		detalhe.setNumero(leitura.nextInt());
		leitura.nextLine();
		view.informaCidade();
		detalhe.setCidade(leitura.nextLine());
		detalhe.setTelosUpDt(new Date());

		EntityManager em = HibernateUtil.getEntityManager();

		em.getTransaction().begin();
		em.persist(detalhe);
		em.getTransaction().commit();

	}

	private String getDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}

}
