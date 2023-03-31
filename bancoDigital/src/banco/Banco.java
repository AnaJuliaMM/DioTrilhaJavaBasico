package banco;
import java.util.List;
import java.util.ArrayList;
import cliente.Cliente;
import contaModelo.Conta;
import contas.ContaCorrente;
import contas.ContaPoupanca;

public class Banco {
	
	private String nome;
	private List<Cliente> clientes ;
	private List<Conta> contasCorrentes;
	private List<Conta> contasPoupancas;
	
	public Banco (String nome) {
		this.nome = nome;
		this.clientes = new ArrayList<>(); //Criando o objeto array
		this.contasCorrentes = new ArrayList<>();
		this.contasPoupancas = new ArrayList<>();
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	public void listarClientes() {
		System.out.println("***** Clientes do banco " + this.nome + " : ******");
		System.out.println(this.clientes + "\n");
	}
	public void adicionarContaCorrentes(Conta ccAnaJulia) {
		contasCorrentes.add(ccAnaJulia);
	}
	public void adicionarContaPoupanca(Conta contaPoupanca) {
		contasPoupancas.add(contaPoupanca);
	}
	public void listarContasCorrentes() {
		System.out.println("\n***** Listas de Contas Correntes ******");
		System.out.println(contasCorrentes);
	}
	public void listarContasPoupancas() {
		System.out.println("\n***** Listas de Contas Poupancas ******");
		System.out.println(contasPoupancas);
	}
	
	

	
	
	

}
