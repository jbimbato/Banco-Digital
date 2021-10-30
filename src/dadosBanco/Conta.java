package dadosBanco;

public class Conta {
	int numero;
	double saldo;
	Cliente cliente;

	public void consultaSaldo() {
		System.out.println(this.saldo);
	}
	
	public void deposito(double valor) {
		if(valor >0) {
			this.saldo += valor;
		}
	}
	
	public void saque(double valor) {
		if(valor > 0 && this.saldo > valor ) {
			this.saldo -= valor;
		} else {
			System.out.println("Não há saldo suficiente.");
		}
	}
	
	public void transfere(Conta conta_destino, double valor) {
		if (valor > 0 && this.saldo > valor) {
			this.saldo -= valor;
			conta_destino.deposito(valor);
		} else {
			System.out.println("A conta de origem não tem saldo suficiente.");
		}
	}


}