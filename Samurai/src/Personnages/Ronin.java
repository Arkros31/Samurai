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
        beneficiaire.recevoir(montantDon);
    }
    
    public void provoquer(Yakuza adversaire) {
        int forceRonin = honneur * 2;

        if (forceRonin >= adversaire.getReputation()) {
            gagnerArgent(adversaire.getArgent());
            adversaire.perdre();
            parler("Je t'ai eu, petit yakuza!");
        } else {
            honneur--;
            argent = 0;
            parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
        }
    }
}
