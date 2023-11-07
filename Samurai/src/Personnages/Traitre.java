package Personnages;

import java.util.ArrayList;

public class Traitre extends Samourai {
    private int niveauTraitrise;

    public Traitre(String seigneur, String nom,  int argent, String boissonPref) {
        super(seigneur, nom,argent, boissonPref);
        niveauTraitrise = 0;
    }

    public void ranconner(Commercant commercant) {
        if (niveauTraitrise < 3) {
            int montantRancon = commercant.getArgent() / 10; // Deux dixièmes de l'argent du commerçant
            commercant.perdreArgent(montantRancon); // Le commerçant perd de l'argent
            gagnerArgent(montantRancon); // Le traître prend la rançon
            parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer! Donne moi " + montantRancon + "sous gare a toi !");
            commercant.parler("Tout de suite grand" + getNom());
            niveauTraitrise++; // Augmentation du niveau de traîtrise
        }else {
        	parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer");
        }
    }

    public void faireLeGentil(Humain ami) {
    	int taille = memoire.size();
        if (taille > 0) {
        	int montantDon = getArgent() / 20; // Un vingtième de l'argent du traître
        	parler("Il faut absolument remonter ma cote de confiance. je vais faire ami ami avec" + ami.nom);
        	parler("Bonjour l'ami j voudrais vous aider en vous donnant " + montantDon +" sous")
            perdreArgent(montantDon); // Le traître fait un don
            ami.gagnerArgent(montantDon); // L'ami gagne de l'argent
            ami.parler("Merci " + nom + " Vous etes quelqu'un de bien!");
            if (niveauTraitrise > 1) {
            	niveauTraitrise--; // Diminution du niveau de traîtrise
            }
        } else {
            parler("Je ne peux faire ami-ami avec personne car je ne connais personne ! Snif.");
        }

    }

    @Override
    public void direBonjour() {
        super.direBonjour();
        parler("Mais je suis un traître et mon niveau de traîtrise est : " + niveauTraitrise + ". Chut !");
    }
}
