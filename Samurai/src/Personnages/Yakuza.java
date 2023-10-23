package Personnages;

public class Yakuza extends Humain {
    private String clan;
    private int reputation;

    public Yakuza(String nom, String boissonPref, int argent, String clan) {
        super(nom, argent, boissonPref);
        this.clan = clan;
        this.reputation = 0;
    }

    public void extorquer(Commercant victime) {
    	int argentVictime = victime.getArgent();
    	argent += argentVictime;
        reputation++;
        parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
        parler(victime.getNom() + ", si tu tiens à la vie donne-moi ta bourse !");
        victime.seFaireExtorquer();
        parler("J'ai piqué les " + argentVictime + " sous de " + victime.getNom() +
        		", ce qui me fait " + argent + " sous dans ma poche. Hi! Hi!");
    }
}
