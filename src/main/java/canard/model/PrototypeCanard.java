package canard.model;

import canard.model.cancan.CanardMuet;
import canard.model.vol.NePasVoler;
import canard.model.vol.PropulsionAReaction;

public class PrototypeCanard extends Canard{

	public PrototypeCanard(String nom) {
		// TODO Auto-generated method stub
		super(nom, new PropulsionAReaction(), new CanardMuet());
		
	}

	@Override
	public String afficher() {
		// TODO Auto-generated method stub
		return "Je suis un prototype de canard";
	}

}
