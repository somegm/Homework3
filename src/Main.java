import Entities.concretes.Campaign;
import Entities.concretes.Game;
import Entities.concretes.Gamer;

public class Main {


    public static void main(String[] args) {
        Game game = new Game(1,"Zula",0,0);
        Gamer gamer = new Gamer(1,"Hasan Fatih","Ertürk","2000");
        Campaign campaign = new Campaign(1,"Yaz indirimi", 50,"27.08.2021","04.09.2021");


    }
}
