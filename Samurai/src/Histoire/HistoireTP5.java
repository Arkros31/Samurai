package Histoire;
import Personnages.Samourai;
import Personnages.Humain;
import Personnages.Ronin;
import Personnages.Yakuza;
import Personnages.Traitre;
import Personnages.Commercant;

public class HistoireTP5 {
    public static void main(String[] args) {
        // Création de l'objet Traître Masako
        Traitre masako = new Traitre("Masako", "Miyamoto",100, "whisky");

        // Test de rançonnement
        Commercant kumi = new Commercant("Kumi", 10);
        Commercant chonin = new Commercant("Chonin", 20);
        Commercant marco = new Commercant("Marco", 30);

        masako.ranconner(kumi);
        masako.ranconner(chonin);
        masako.ranconner(marco);

        // Test de faireLeGentil
        Samourai akimoto = new Samourai("Akimoto", "Miyamoto", 80 ,"saké");
        Yakuza yaku = new Yakuza("Yaku Le Noir", 30, "whisky", "Warsong");

        masako.faireLeGentil(akimoto);
        masako.faireLeGentil(yaku);

        // Présentation des personnages
        akimoto.direBonjour();
        yaku.direBonjour();
        masako.direBonjour();

        // Remarque : Le niveau de traîtrise de Masako est à 2, car il a fait ami-ami avec Yaku Le Noir.
        // Il ne peut plus rançonner, car son niveau de traîtrise est à 3.
    }
}
