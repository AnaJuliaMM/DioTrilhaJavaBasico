package apps;
//Encapsulamento

import msm_messenger.ServicoMensagemInstantanea;

public class MsnMessenger extends ServicoMensagemInstantanea{
	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("jeito MSN de enviar ");
		salvarHistoricoMensagem();

	}
	public void receberMensagem() {
		validarConexaoInternet();
		System.out.println("jeito MSN de receber ");
		salvarHistoricoMensagem();

	}
	
	
	
	
}
