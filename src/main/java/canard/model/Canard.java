package canard.model;

import canard.model.vol.ComportementVol;
import canard.model.vol.NePasVoler;

public abstract class Canard {
	protected String nom;
	private ComportementVol comportementVol;
	
	public Canard(String nom, ComportementVol comportementVol) {
		this.nom = nom;
		 this.comportementVol = comportementVol;
	}


	public String nager() {
		return "Tous les canards flottent, même les leurres !";
	}
	
	public abstract String afficher(); 
	
	public String getNom() {
		return this.nom;
	}
	

    public void setComportementVol(ComportementVol comportementVol) {
        this.comportementVol = comportementVol;
    }

    public String effectuerVol() {
        return comportementVol.voler();
    }
	
}
