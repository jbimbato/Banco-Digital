package dadosBanco;

import java.util.Scanner;

public class Operator {

	public String verificaCpf(){
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
		return cpf_cliente;
		
	}
	
	public String addNome(){
		System.out.println("Digite seu nome:");
		Scanner scanNome = new Scanner(System.in);
		String nome_cliente = scanNome.nextLine();
		return nome_cliente;
	}
	
	public Conta cria1Conta(){
		System.out.println("Deseja criar sua primeira conta? Responda 'S' ou 'N'");
		Scanner scanResposta = new Scanner(System.in);
		String resposta = scanResposta.nextLine();
		if (resposta.equalsIgnoreCase("S")) {
			Conta conta1 = new Conta();
			conta1.numero = String.valueOf(Math.floor(Math.random() * 10001));
			System.out.println("Conta criada com sucesso. O numero da sua conta nova é:" +conta1.todasContas.get(0).numero+ "\n");
			return conta1;
		} else if(resposta.equalsIgnoreCase("N")) {
			System.out.println("Cliente cadastrado sem conta");
		}
		else {
			System.out.println("Resposta não esperada. Cliente cadastrado sem conta");
		}
		return null;
		
	}
}
