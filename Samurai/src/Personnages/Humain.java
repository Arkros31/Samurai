package Personnages;

import java.util.ArrayList;
import java.util.List;

public class Humain {
    private String nom;
    private int argent;
    private String boissonPref;
    private List<Humain> memoire;

    public Humain(String nom, int argent, String boissonPref) {
        this.nom = nom;
        this.boissonPref = boissonPref;
        this.argent = argent;
        this.memoire = new ArrayList<>();
    }

    public void faireConnaissanceAvec(Humain autreHumain) {
        memoire.add(autreHumain);
        autreHumain.memoire.add(this);
        
        this.direBonjour();
        autreHumain.direBonjour();
        
        while (memoire.size() > 3) {
            Humain plusAncien = memoire.get(0);
            for (Humain autre : memoire) {
                if (autre != autreHumain && autre.memoire.size() > plusAncien.memoire.size()) {
                    plusAncien = autre;
                }
            }
            memoire.remove(plusAncien);
        }
    }

    public void listerConnaissance() {
        parler("Je connais beaucoup de monde dont : ");
        for (int i = 0; i < memoire.size(); i++) {
            System.out.print(memoire.get(i).nom);
            if (i < memoire.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
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
