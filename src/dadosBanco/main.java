package dadosBanco;

public class main {

	public static void main(String[] args) {
	
		Cliente cliente1 = Cliente.cadastraCliente();
		cliente1 = cliente1.cadastraCliente();
		
		Cliente cliente2 = new Cliente();
		cliente2 = cliente2.cadastraCliente();
	}

}
