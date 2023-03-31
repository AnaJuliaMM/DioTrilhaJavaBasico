package contaModelo;

import cliente.Cliente;
import contaInterface.IConta;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 0;
	private static  int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	@Override
	public void depositar(double valor) {
		this.saldo += valor;		
	}
	@Override
	public void transfirir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	protected void imprimirAtributosComuns() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println(String.format("Titular: %s\n", this.cliente.getNome()));

	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
