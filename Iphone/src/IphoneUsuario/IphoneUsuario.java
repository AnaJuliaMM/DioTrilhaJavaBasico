package IphoneUsuario;

import equipamento.Iphone;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusicial;

public class IphoneUsuario {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		
		System.out.println("-Funcoes Reprodutor Musical:\n");
		iphone.selecionarMusica();
		iphone.tocar();
		iphone.pausar();
		
		System.out.println("\n-Funcoes Aparelho Telefonico:\n");
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		System.out.println("\n-Funcoes Navegador de Internet:\n");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		iphone.exibirPagina();
		
		
		ReprodutorMusicial reprodutorMusical = iphone;
		AparelhoTelefonico aparelhoTelefonico = iphone;
		NavegadorInternet  navegadorInternet = iphone;
		
		
		
		
	}

}
