package Personnages;

public class Commercant extends Humain {
    public Commercant(String nom, int argent) {
        super(nom, argent, "thé");
    }

    public void seFaireExtorquer() {
        argent = 0;
        parler("J'ai tout perdu! Le monde est trop injuste...");
    }

    public void recevoir(int argentReçu) {
        argent += argentReçu;
        parler(argentReçu + " sous ! Je te remercie généreux donateur!");
    }
}
