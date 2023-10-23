package Histoire;
import Personnages.Humain;

public class HistoireTp4 {
	
	public static void main(String[] args) {
			Humain prof = new Humain("prof", 54, "kombucha");
			prof.direBonjour();
			prof.acheter("kombucha", 12);
			prof.boire("kombucha");
			prof.acheter("jeu", 2);
			prof.acheter("kimono", 50);
	}
}
