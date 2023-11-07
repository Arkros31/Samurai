package Personnages;

public class Samourai extends Ronin {
    private String seigneur;

    public Samourai(String nom, String seigneur, int argent , String boissonPref) {
        super(nom, argent, boissonPref);
        this.seigneur = seigneur;
    }

    @Override
    public void direBonjour() {
        super.direBonjour();
        parler("Je suis fier de servir le seigneur " + seigneur + ".");
    }
    
    @Override
    public void boire(String boisson) {
        parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson + ".");
    }

}
