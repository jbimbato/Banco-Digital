package dadosBanco;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
	String cpf;
	String nome;
	ArrayList<Conta> contas = new ArrayList();
	static ArrayList<Cliente> clientes = new ArrayList();
	static int numeroClientes;

	public Cliente () {
		
				
		//Pede ao usuario os dados ao dar o new Cliente
		System.out.println("Digite seu CPF:");
		Scanner scanCpf = new Scanner(System.in);
		String cpf_cliente = scanCpf.nextLine();
		
		//Verifica CPF
		for(int i=0; i < Cliente.clientes.size();i++) {
			if (Cliente.clientes.get(i).cpf.equals(cpf_cliente)) {
				throw new IllegalArgumentException("Esse CPF já está cadastrado no sistema");
			}
		}

		this.cpf = cpf_cliente;
		
		System.out.println("Digite seu nome:");
		Scanner scanNome = new Scanner(System.in);
		String nome_cliente = scanNome.nextLine();
		this.nome = nome_cliente;
		

		//Adiciona cliente cadastrado ao vetor de clientes na ultima posição
		//Usei arraylist pra ficar mais dinamico
		Cliente.clientes.add(this);	
		
		//Add +1 ao numero de clientes
		Cliente.numeroClientes++;
		
		//Criar a primeira conta pro cliente
		System.out.println("Deseja criar sua primeira conta? Responda 'S' ou 'N'");
		Scanner scanResposta = new Scanner(System.in);
		String resposta = scanResposta.nextLine();
		if (resposta.equalsIgnoreCase("S")) {
			Conta conta = new Conta();
			conta.numero = String.valueOf(Math.floor(Math.random() * 10001));
			this.contas.add(conta);
			System.out.println("Conta criada com sucesso. O numero da sua conta nova é:" +this.contas.get(0).numero+ "\n");
			
		} else if(resposta.equalsIgnoreCase("N"))
			System.out.println("Cliente cadastrado sem conta");
		else 
			System.out.println("Resposta não esperada. Cliente cadastrado sem conta");
		
		
		
	}
	
	public static void novaContaClienteCadastrado() {
		System.out.println("Digite o CPF da pessoa que quer abrir a conta:");
		Scanner scanCpf = new Scanner(System.in);
		String cpf_cliente = scanCpf.nextLine();
		
		for(int i=0; i < Cliente.clientes.size();i++) {
			if (Cliente.clientes.get(i).cpf.equals(cpf_cliente)) {
				Conta conta = new Conta();
				conta.numero = String.valueOf(Math.floor(Math.random() * 10001));
				Cliente.clientes.get(i).contas.add(conta) ;
			}
		}	
		
	}

}