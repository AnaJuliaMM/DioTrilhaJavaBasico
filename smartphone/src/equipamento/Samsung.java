package equipamento;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusicial;

public class Samsung implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusicial {
	public void ligar() {
		System.out.println("Ligando pelo Samsung");
	}
	public void atender() {
		System.out.println("Atendendo a ligação pelo Samsung");
		
	}
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz pelo Samsung");
		
	}

	public void exibirPagina() {
		System.out.println("Exibindo a página Web pelo Samsung");
		
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba pelo Samsung");		
	}

	public void atualizarPagina() {
		System.out.println("Atualizando página pelo Samsung");		
	}

	public void tocar() {
		System.out.println("Tocando música pelo Samsung");		
	}

	public void pausar() {
		System.out.println("Pausando música pelo Samsung");		
	}

	public void selecionarMusica() {
		System.out.println("Selecionando música pelo Samsung");		
	}

}
