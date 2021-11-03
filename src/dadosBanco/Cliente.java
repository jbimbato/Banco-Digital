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
		
	}
	
//	static public Cliente cadastraCliente() {
//	
//		Cliente cliente = new Cliente();
//			
//		System.out.println("Digite seu CPF:");
//		Scanner c = new Scanner(System.in);
//		String cpf_cliente = c.nextLine();
//		cliente.cpf = cpf_cliente;
//		
//		System.out.println("Digite seu nome:");
//		Scanner n = new Scanner(System.in);
//		String nome_cliente = n.nextLine();
//		cliente.nome = nome_cliente;
//		
//		}
		

}