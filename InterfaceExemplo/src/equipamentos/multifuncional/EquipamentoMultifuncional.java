package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

//Não é possível herdar tanto de copiadora, digitalizadora  e impressora!

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{
	public void copiar() {
		// TODO Auto-generated method stub
		System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
	}

	public void digitalizar() {
		// TODO Auto-generated method stub
		System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
	}

	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
	}
	

}
