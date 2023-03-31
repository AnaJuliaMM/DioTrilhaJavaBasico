package bancoAtendimento;
import banco.Banco;
import cliente.Cliente;
import contaModelo.Conta;
import contas.ContaCorrente;
import contas.ContaPoupanca;

public class Main{
	public static void main(String[] args) {
		
		Banco inter = new Banco("Inter");
		
		Cliente anaJulia = new Cliente("Ana Julia");
		anaJulia.cadastrarBanco(inter);
		
		Cliente joao = new Cliente("Joao");
		joao.cadastrarBanco(inter);
		
		Conta ccAnaJulia = new ContaCorrente(anaJulia);
		inter.adicionarContaCorrentes(ccAnaJulia);
		Conta poupancaJoao = new ContaPoupanca(joao);
		inter.adicionarContaPoupanca(poupancaJoao);
		Conta poupancaAnaJulia = new ContaPoupanca(anaJulia);
		inter.adicionarContaPoupanca(poupancaAnaJulia);
		
		
		ccAnaJulia.depositar(100.00);
		ccAnaJulia.transfirir(50.00, poupancaJoao);
		ccAnaJulia.transfirir(50, poupancaAnaJulia);
		
		ccAnaJulia.imprimirExtrato();
		poupancaAnaJulia.imprimirExtrato();
		poupancaJoao.imprimirExtrato();
		
		inter.listarClientes();
		inter.listarContasCorrentes();
		inter.listarContasPoupancas();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}

/*

		
		
		anaJulia.cadastrarBanco(inter);
		
		
		
		
		;
		
		
		
		
		
		
		
		
*/