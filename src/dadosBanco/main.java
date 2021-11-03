package dadosBanco;

import java.util.ArrayList;
import java.util.Scanner;



public class main {

	public static void main(String[] args) {
	
		String resposta = "1";
		Cliente cliente1 = new Cliente();
		cliente1.contas.get(0).deposito();
		//Cliente.novaContaClienteCadastrado();
		
		do {
			System.out.println("Bem vindo ao Banco Banco. Já é cliente?\n\n"
					+ "1 = Sim\n2 = Não"
					+ "\n\nDigite 0 a qualquer momento para sair."
					+ "\n\nDigite a opção desejada:");
			
			Scanner scanIntro = new Scanner(System.in);
			resposta = scanIntro.nextLine();
			
			
			//Já é cliente
			if(resposta.equals("1")) {
				
				System.out.println("Digite seu CPF:");
				Scanner scanCPF = new Scanner(System.in);
				String cpf = scanCPF.nextLine();
				
				
				for(int i=0; i < Cliente.clientes.size();i++) {
					if (Cliente.clientes.get(i).cpf.equals(cpf)) {
						System.out.println("Olá, "+Cliente.clientes.get(i).nome+ "! que operação deseja realizar?");
						System.out.println("\n1. Consultar Saldo\n2. Saques\n3. Depositos\n4. Transferencias\n5. Abrir uma nova conta."
								+ "\n\nDigite a opção desejada:");
						Scanner scanJaCliente = new Scanner(System.in);
						resposta = scanJaCliente.nextLine();
						
						//Já é cliente > consulta saldo
						if(resposta.equals("1")) {
								System.out.println("Qual conta deseja acessar?");
								for(int n = 0;n<Cliente.clientes.get(i).contas.size();n++) {
									System.out.println(+(n+1)+". " +Cliente.clientes.get(i).contas.get(n).numero);
								}
								Scanner scanContaSaldo = new Scanner(System.in);
								resposta = scanContaSaldo.nextLine();
								Cliente.clientes.get(i).contas.get(Integer.valueOf(resposta)-1).consultaSaldo();
						}
						
						//Já é cliente > Saque
						if(resposta.equals("2")) {
								System.out.println("Qual conta deseja acessar?");
								for(int n = 0;n<Cliente.clientes.get(i).contas.size();n++) {
									System.out.println(+(n+1)+". " +Cliente.clientes.get(i).contas.get(n).numero);
								}
								Scanner scanContaSaque = new Scanner(System.in);
								resposta = scanContaSaque.nextLine();
								
								Cliente.clientes.get(i).contas.get(Integer.valueOf(resposta)-1).saque();
								System.out.print("Saque realizado com sucesso. Seu saldo atual é: ");
								Cliente.clientes.get(i).contas.get(Integer.valueOf(resposta)-1).consultaSaldo();
						}
						
						//Já é cliente > Deposito
						if(resposta.equals("3")) {
							System.out.println("Qual conta deseja acessar?");
							for(int n = 0;n<Cliente.clientes.get(i).contas.size();n++) {
								System.out.println(+(n+1)+". " +Cliente.clientes.get(i).contas.get(n).numero);
							}
							Scanner scanContaDeposito = new Scanner(System.in);
							resposta = scanContaDeposito.nextLine();
							
							Cliente.clientes.get(i).contas.get(Integer.valueOf(resposta)-1).deposito();
							System.out.print("Deposito realizado com sucesso. Seu saldo atual é: ");
							Cliente.clientes.get(i).contas.get(Integer.valueOf(resposta)-1).consultaSaldo();
						}
						
						//Já é cliente > Transfere
						if(resposta.equals("4")) {
							System.out.println("Qual conta deseja acessar?");
							for(int n = 0;n<Cliente.clientes.get(i).contas.size();n++) {
								System.out.println(+(n+1)+". " +Cliente.clientes.get(i).contas.get(n).numero);
							}
							Scanner scanContaDeposito = new Scanner(System.in);
							resposta = scanContaDeposito.nextLine();
							
							Cliente.clientes.get(i).contas.get(Integer.valueOf(resposta)-1).transfere();
						}
						
						//Já é cliente > Cria nova conta
						if(resposta.equals("5")) {
							System.out.println("Deseja mesmo abrir uma conta nova?");
							Scanner scanRespostaAbConta = new Scanner(System.in);
							String ConfirmaAbreConta = scanRespostaAbConta.nextLine();
							if (ConfirmaAbreConta.equalsIgnoreCase("S")) {
								Conta contaNova = new Conta();
								contaNova.numero = String.valueOf(Math.floor(Math.random() * 10001));
								Cliente.clientes.get(i).contas.add(contaNova);
								System.out.println("Agora você possui as seguintes contas:");
								for(int n = 0;n<Cliente.clientes.get(i).contas.size();n++) {
									System.out.println(+(n+1)+". " +Cliente.clientes.get(i).contas.get(n).numero+ "\n");
								}

							} else if(resposta.equalsIgnoreCase("N"))
								System.out.println("Ok. Voltando ao menu principal.\n\n");
							else 
								System.out.println("Resposta não esperada. Voltando ao menu principal.\n\n");

						}
					}
				}
			}
			
			//Cliente novo
			if(resposta.equals("2")) {
				System.out.println("Olá! Deseja se cadastrar no nosso banco? Responda 'S' ou 'N'");
				Scanner confirmaCadastro = new Scanner(System.in);
				resposta = confirmaCadastro.nextLine();
				if (resposta.equalsIgnoreCase("S")) {
					Cliente cliente = new Cliente();
				} else if(resposta.equalsIgnoreCase("N"))
					System.out.println("Tudo bem... Voltando ao menu principal.");
				else 
					System.out.println("Resposta não esperada. Voltando ao menu principal.");
			}
		} while(!resposta.equals("0"));
		
		System.out.println(cliente1.cpf);
		System.out.println(Cliente.numeroClientes);
		System.out.println(Cliente.clientes.get(0).nome);
		System.out.println(cliente1.contas.get(0).numero);

		System.out.println(cliente1.contas.get(1).numero);

		Cliente cliente2 = new Cliente();
		System.out.println(cliente2.cpf);
		System.out.println(Cliente.numeroClientes);
		System.out.println(Cliente.clientes.get(1).nome);
		
	
		//criar array de cliente pra saber os clientes ja cadastrados
		// checa numero de contas cadastradas
		// criar vetor de contas pra cada clientel
	
		// perguntar pro usuario o que ele quer fazer: cadastrar cliente, nova conta pro cliente, depositar dinheiro, etc
		// ficar nesse loop
		
		//pensar jeito de voltar pro menu de ja sou cliente ao inves pro inicio (front end?)
		

	}
}
