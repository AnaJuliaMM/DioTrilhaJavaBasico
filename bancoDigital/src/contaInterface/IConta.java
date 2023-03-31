package contaInterface;

public interface IConta {
	void sacar(double valor);
	void depositar(double valor);
	void imprimirExtrato();
	void transfirir(double valor, IConta contaDestino);
}
