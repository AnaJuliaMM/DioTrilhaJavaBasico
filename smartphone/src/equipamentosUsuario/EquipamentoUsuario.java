package equipamentosUsuario;

import equipamento.Iphone;
import equipamento.Samsung;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusicial;

public class EquipamentoUsuario {

	public static void main(String[] args) {
		
		System.out.println("1. Equipamento: Iphone\n");
		
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
		
		System.out.println("\n2. Equipamento: Samsung\n");
		
		Samsung samsung = new Samsung();
		
		reprodutorMusical = samsung;
		aparelhoTelefonico = samsung;
		navegadorInternet = samsung;
		
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
