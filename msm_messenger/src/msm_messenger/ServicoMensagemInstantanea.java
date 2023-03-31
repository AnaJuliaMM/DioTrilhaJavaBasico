package msm_messenger;

//Herança
public abstract class ServicoMensagemInstantanea {
	//Abstração: métodos que não tem corpo
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	//Somente filhos conhecem
	protected void validarConexaoInternet(){
		System.out.println("Validando");
	}
	protected void salvarHistoricoMensagem() {
		System.out.println("Salvando Histórico de Mensagem");
	};
	
	


}
