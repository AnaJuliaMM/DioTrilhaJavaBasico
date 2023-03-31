package cliente;
import banco.Banco;

public class Cliente{
	private String nome;
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//Métodos que são ativados pela interação entre a classe banco e cliente
	public void cadastrarBanco(Banco banco){
		banco.adicionarCliente(this);
	}
	public String toString() {
		return nome;
	}
}
