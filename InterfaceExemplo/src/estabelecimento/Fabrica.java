package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.LaserJet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional(); 
		
		//Deskjet deskjet = new Deskjet();
		//Digitalizadora digitalizadora = deskjet; -->Deskjet não é digitalizadora 

		Scanner scanner = new Scanner();
		
		Impressora impressora = em;
		
		Digitalizadora digitalizadora = em;
		Digitalizadora digitalizadoraScanner = scanner;
		
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		digitalizadoraScanner.digitalizar();
		copiadora.copiar();
		
	}
}
