package Personnages;

public class Humain {

	private String nom;
	private int argent;
	private String boissonPref;

	public Humain(String Nom, int Argent, String BoissonPref) {
		super();
		nom = Nom;
		argent = Argent;
		boissonPref = BoissonPref;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public void gagnerArgent(int gain) {
		argent = argent + gain;
	}

	public void perdreArgent(int perte) {
		argent = argent - perte;
	}

	public void parler(String texte) {
		System.out.println("(" + nom +")" + " - " + texte);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonPref + "");
	}

	public void boire(String boisson) {
		parler(" Mmmm, un bon verre de " + boisson + "! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (argent < prix) {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux meme pas m'offrir " + bien +" à " + prix +" sous");
		}
		parler("J'ai " + argent +" sous en poche. Je vais pouvoir m'offrir " + bien +" à " + prix +" sous");
		perdreArgent(prix);
	}
}