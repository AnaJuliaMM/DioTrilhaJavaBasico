package IphoneUsuario;

import equipamento.Iphone;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusicial;

public class IphoneUsuario {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone(); 
		
		//Referenciando e instanciando
		ReprodutorMusicial reprodutorMusical = iphone;
		AparelhoTelefonico aparelhoTelefonico = iphone;
		NavegadorInternet  navegadorInternet = iphone;
		
		reprodutorMusical.selecionarMusica();  
		reprodutorMusical.tocar();
		reprodutorMusical.pausar();
		
		aparelhoTelefonico.atender();
		aparelhoTelefonico.ligar();
		aparelhoTelefonico.iniciarCorreioVoz();
		
		navegadorInternet.adicionarNovaAba();
		navegadorInternet.atualizarPagina();
		navegadorInternet.exibirPagina();
		
		
			
		
		

	}
}
