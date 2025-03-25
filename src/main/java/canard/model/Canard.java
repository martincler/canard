package canard.model;

public abstract class Canard {
	String nom;
	
	public Canard(String nom) {
		this.nom = nom;
	}
	
	public String nager() {
		return "Tous les canards flottent, même les leurres !";
	}
	
	public abstract String afficher(); 
	
	public String getNom() {
		return this.nom;
	}
	
}
