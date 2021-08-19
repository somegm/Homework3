package Entities.concretes;

import Entities.Abstracts.SaleService;

public class Sale implements SaleService {
    @Override
    public void sale(Gamer gamer, Game game) {
        System.out.println(game.getGameName() + " has been sold to " + gamer.getFirstName()
                + " for " + game.getUnitPrice());
    }

    @Override
    public void campaignSale(Gamer gamer, Game game, Campaign campaign) {
        System.out.println(game.getGameName() + " has been sold to " + gamer.getFirstName()
                + " for " + (game.getUnitPrice() - (game.getUnitPrice() * campaign.getCampaignDiscount() / 100.0)));
    }
}
