package Histoire;
import Personnages.Humain;
import Personnages.Ronin;
import Personnages.Commercant;
import Personnages.Yakuza;

public class HistoireTp4 {
    public static void main(String[] args) {
    	Commercant marchand = new Commercant("Marco");
        Ronin ronin = new Ronin("Roro", "shochu", 60);

        ronin.direBonjour();
        ronin.donner(marchand);
    }
}
