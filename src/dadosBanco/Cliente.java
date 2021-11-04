package dadosBanco;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Operator {
	String cpf;
	String nome;
	ArrayList<Conta> contas = new ArrayList();
	static ArrayList<Cliente> clientes = new ArrayList();
	static int numeroClientes;

	public Cliente () {
		
		//Verifica e adiciona CPF
		this.cpf = verificaCpf();
		
		//Verifica e add Nome
		this.nome = addNome();
		

		//Adiciona cliente cadastrado ao vetor de clientes na ultima posição
		Cliente.clientes.add(this);	
		
		//Add +1 ao numero de clientes
		Cliente.numeroClientes++;
		
		//Criar a primeira conta pro cliente
		this.contas.add(cria1Conta());
		
		
		
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