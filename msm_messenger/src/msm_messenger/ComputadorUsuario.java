package msm_messenger;

import apps.FacebookMessenger;
import apps.MsnMessenger;
import apps.TelegramMessenger;

public class ComputadorUsuario {

	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="tlg"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MsnMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new TelegramMessenger();
		
		//Abstração: independente de quem for, fará isso
		smi.enviarMensagem();
		smi.receberMensagem();
	}
	

}
