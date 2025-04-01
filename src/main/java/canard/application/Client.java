package canard.application;

import canard.model.Colvert;
import canard.model.PrototypeCanard;

public class Client {
	
	private static final String LIGNE = "-----------------";
	
	public static void main(String[] args) {
		
		Colvert donald = new Colvert("Donald");
		PrototypeCanard mechaDonald = new PrototypeCanard("MECHA donald");
		
		System.out.println(donald.afficher());
		System.out.println(donald.nager());
		System.out.println(donald.effectuerCancan());
		System.out.println(donald.effectuerVol());
		
		System.out.println(mechaDonald.afficher());
		System.out.println(mechaDonald.effectuerVol());
		
	}

}
