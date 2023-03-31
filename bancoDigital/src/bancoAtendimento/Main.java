package bancoAtendimento;

import java.util.ArrayList;

import banco.Banco;
import cliente.Cliente;
import contaModelo.Conta;
import contas.ContaCorrente;
import contas.ContaPoupança;

public class Main {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		ArrayList<Cliente> clientes = null;
	
		Cliente anaJulia = new Cliente();
		anaJulia.setNome("Ana Julia");
		Cliente Joao = new Cliente();
		Joao.setNome("Joao");
	
		
		Conta cc = new ContaCorrente(anaJulia);
		Conta poupanca = new ContaPoupança(anaJulia);
		
		cc.depositar(100.00);
		cc.transfirir(100.00, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	
	}

}
