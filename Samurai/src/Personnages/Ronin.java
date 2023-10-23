package Personnages;

public class Ronin extends Humain {
    private int honneur;

    public Ronin(String nom, String boissonPref, int argent) {
        super(nom, argent, boissonPref);
        this.honneur = 1;
    }

    public void donner(Commercant beneficiaire) {
        int montantDon = (int)(argent * 0.1);
        argent -= montantDon;
        beneficiaire.gagnerArgent(montantDon);
        parler(getNom() + " prend ces " + montantDon + " sous.");
    }
}
