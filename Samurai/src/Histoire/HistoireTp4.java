package Histoire;
import Personnages.Humain;
import Personnages.Commercant;

public class HistoireTp4 {
	
	public static void main(String[] args) {
		Commercant marchand = new Commercant("Marco");
        
        marchand.direBonjour();
        marchand.seFaireExtorquer();
        marchand.recevoir(15);
        marchand.boire("thé");
	}
}
