package equipamento;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusicial;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusicial{
	
	public void selecionarMusica() {
		System.out.println("Selecionando música para tocar no Iphone");
	}
	public void tocar() {
		System.out.println("Tocando música no Iphone");	
	}
	public void pausar() {
		System.out.println(">pausando a música do Iphone<");	
	}

	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("Adicionando nova aba para pesquisa no Iphone");
	}
	public void exibirPagina() {
		System.out.println("Exibindo a página no Iphone");	
	}
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("Atualizando a página no Iphone");
	}

	
	public void ligar() {
		System.out.println("Fazendo ligação no Iphone");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz no Iphone");
	}
	public void atender() {
		System.out.println("Atendendo ligação no Iphone");	
	}

	
}
