package dadosBanco;

import java.util.Scanner;

public class Cliente {
	String cpf;
	String nome;
	Conta conta;

	static public Cliente cadastraCliente() {
	
		Cliente cliente = new Cliente();
			
		System.out.println("Digite seu CPF:");
		Scanner c = new Scanner(System.in);
		String cpf_cliente = c.nextLine();
		cliente.cpf = cpf_cliente;
		
		System.out.println("Digite seu nome:");
		Scanner n = new Scanner(System.in);
		String nome_cliente = n.nextLine();
		cliente.nome = nome_cliente;
		
		if(cliente.conta.numero != 0) {
			return cliente;
		} else {
			cliente.conta = new Conta();
			return cliente;
		}
		
	}

}