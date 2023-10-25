package Personnages;

public class Yakuza extends Humain {
    private String clan;
    private int reputation;

    public Yakuza(String nom, int argent, String boissonPref, String clan) {
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
    
    public void perdre() {
        argent = 0;
        reputation--;
        parler("J'ai perdu mon duel et mes " + argent + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
    }

    public void gagner(int gain) {
        argent += gain;
        reputation++;
        parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + "? Je l'ai dépouillé de ses " + gain + " sous.");
    }

    public int getReputation() {
        return reputation;
    }
}
