package contas;
import cliente.Cliente;
import contaModelo.Conta;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void imprimirExtrato() {
		System.out.println("****** Extrato Conta Corrente *******");
		imprimirAtributosComuns();
	}
	

	

	
	

}
