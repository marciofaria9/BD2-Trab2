package br.edu.univas.si5.bd2.view;

public class View {

	public void menuInicial() {

		System.out.println("Bem vindo ao controle de Clientes e pedidos \n");
		System.out.println("Digite 1 para Cadastro de cliente");
		System.out.println("Digite 2 para Cadastro de pedido");
		System.out.println("Digite 3 para encontrar cliente");
		System.out.println("Digite 4 para encontrar pedido");
		System.out.println("Digite 5 deletar cliente");
		System.out.println("Digite 6 deletar pedido");
		System.out.println("Digite 0 para sair");

	}

	public void informaCliente() {
		System.out.println("Informe o nome ID do cliente:");

	}

	public void informaNome() {
		System.out.println("Informe o nome do cliente:");
	}

	public void informaNascimento() {
		System.out.println("Informe a data de nascimento do cliente:");
	}

	public void informaCPF() {
		System.out.println("Informe o CPF do cliente:");

	}

	public void informaRua() {
		System.out.println("Informe a rua do cliente:");
	}

	public void informaBairro() {
		System.out.println("Informe o bairro do cliente:");

	}

	public void informaNumero() {
		System.out.println("Informe o número da casa do cliente:");

	}

	public void informaCidade() {
		System.out.println("Informe a cidade do cliente:");
	}

	public void informaFK() {
		System.out.println("Digite o ID do Cliente responsável pelo pedido:");
	}

	public void informaID() {
		System.out.println("Informe o ID do pedido:");
	}

	public void informaData() {
		System.out.println("Informe a Data do pedido:");
	}

	public void informaValor() {
		System.out.println("Informe o Valor:");
	}

	public void sair() {
		System.out.println("Tchau!");
	}

	public void informaAutoId() {
		System.out.println("Informe o AutoId do cliente");
	}
	
	public void naoEncontrado() {
		System.out.println("não encontrado");
	}
	
	public void removido() {
		System.out.println("removido!");
	}
	

	public void alertaCPF() {
		System.out.println("Confirme digitando o CPF do cliente");
	}
	
}
