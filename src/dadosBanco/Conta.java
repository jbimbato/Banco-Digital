package dadosBanco;

import java.util.ArrayList;
import java.util.Scanner;

public class Conta {
	String numero;
	double saldo = 0;
	static ArrayList<Conta> todasContas = new ArrayList();
	
	public Conta(){
		Conta.todasContas.add(this);
	}

	
	public void consultaSaldo() {
		System.out.println(+this.saldo+"\n");
	}
	
	public void deposito() {
		
		System.out.println("Digite o valor que quer depositar:");
		Scanner valorDeposito = new Scanner(System.in);
		int valorD = Integer.valueOf(valorDeposito.nextLine());
		
		if(valorD >0) {
			this.saldo += valorD;
		}
	}
	
	public void saque() {
		
		System.out.println("Digite o valor que quer sacar:");
		Scanner valorSaque = new Scanner(System.in);
		int valorS = Integer.valueOf(valorSaque.nextLine());
		
		if(valorS > 0 && this.saldo > valorS ) {
			this.saldo -= valorS;
		} else {
			System.out.println("Não há saldo suficiente.\n");
		}
	}
	
	public void transfere() {
		
		System.out.println("Digite o numero da conta que deseja transferir:");
		Scanner contaTransferencia = new Scanner(System.in);
		String numeroConta = contaTransferencia.nextLine();
		
		
		for(int i=0;i<=Conta.todasContas.size();i++) {
			if(i==Conta.todasContas.size()){
				System.out.println("Essa conta não existe no nosso banco\n\n");
				break;
			}
			
			else if(numeroConta.equals(Conta.todasContas.get(i).numero)) {
				System.out.println("Digite o valor que deseja transferir pra essa conta:");
				Scanner valorTransfer = new Scanner(System.in);
				double valorTransferir = Double.valueOf(valorTransfer.nextLine());
				if (valorTransferir > 0 && this.saldo > valorTransferir) {
					this.saldo -= valorTransferir;
					Conta.todasContas.get(i).deposito();
					System.out.print("Transferência realizada com sucesso. Seu saldo atual é: ");
					this.consultaSaldo();
				} else {
					System.out.println("A conta de origem não tem saldo suficiente.");
				
				}
			}
		}
	}


}