package Entities.Abstracts;
import Entities.concretes.Campaign;
import Entities.concretes.Gamer;
import Entities.concretes.Game;


public interface SaleService {
    void sale(Gamer gamer, Game game);

    void campaignSale(Gamer gamer, Game game, Campaign campaign);

}
