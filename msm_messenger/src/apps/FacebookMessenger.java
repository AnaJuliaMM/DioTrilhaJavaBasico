package apps;

import msm_messenger.ServicoMensagemInstantanea;

public class FacebookMessenger extends ServicoMensagemInstantanea{
	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("jeito FACEBOOK de enviar ");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		validarConexaoInternet();
		System.out.println("jeito FACEBOOK de receber ");
		salvarHistoricoMensagem();
	}
}
