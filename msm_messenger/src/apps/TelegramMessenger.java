package apps;

import msm_messenger.ServicoMensagemInstantanea;

public class TelegramMessenger  extends ServicoMensagemInstantanea{
	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("jeito TELEGRAM de enviar ");
		salvarHistoricoMensagem();

	}
	public void receberMensagem() {
		validarConexaoInternet();
		System.out.println("jeito TELEGRAM de receber ");
		salvarHistoricoMensagem();


	}
}
