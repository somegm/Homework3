package Entities.concretes;

import Entities.Abstracts.CampaingManager;

public class Salary extends Campaign implements CampaingManager {

    public Salary(int campaingId, String campaignName, int campaignDiscount, String campaignStartDate, String campaignEndDate) {
        super(campaingId, campaignName, campaignDiscount, campaignStartDate, campaignEndDate);
    }

    @Override
    public void add(Campaign campaing) {
        System.out.println(getCampaignName()+" adlı satış eklendi");

    }

    @Override
    public void delete(Campaign campaing) {
        System.out.println(getCampaignName()+" adlı satış silindi");

    }

    @Override
    public void update(Campaign campaing) {
        System.out.println(getCampaignName()+" adlı satış güncellendi");

    }
}
