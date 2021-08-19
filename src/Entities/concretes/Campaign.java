package Entities.concretes;

import Entities.Abstracts.CampaingManager;

public class Campaign implements CampaingManager {
        private int campaingId;
        private String campaignName;
        private int campaignDiscount;
        private String campaignStartDate;
        private String campaignEndDate;

        public int getCampaingId() {
            return campaingId;
        }

        public void setCampaingId(int campaingId) {
            this.campaingId = campaingId;
        }

        public String getCampaignName() {
            return campaignName;
        }

        public void setCampaignName(String campaignName) {
            this.campaignName = campaignName;
        }

        public int getCampaignDiscount() {
            return campaignDiscount;
        }

        public void setCampaignDiscount(int campaignDiscount) {
            this.campaignDiscount = campaignDiscount;
        }

        public String getCampaignStartDate() {
            return campaignStartDate;
        }

        public void setCampaignStartDate(String campaignStartDate) {
            this.campaignStartDate = campaignStartDate;
        }

        public String getCampaignEndDate() {
            return campaignEndDate;
        }

        public void setCampaignEndDate(String campaignEndDate) {
            this.campaignEndDate = campaignEndDate;
        }



        public Campaign(int campaingId, String campaignName, int campaignDiscount, String campaignStartDate, String campaignEndDate) {
            this.campaingId = campaingId;
            this.campaignName = campaignName;
            this.campaignDiscount = campaignDiscount;
            this.campaignStartDate = campaignStartDate;
            this.campaignEndDate = campaignEndDate;
        }


    @Override
    public void add(Campaign campaing) {
        System.out.println(getCampaignName()+" adlı satış eklendi");

    }

    @Override
    public void delete(Campaign campaing) {

    }

    @Override
    public void update(Campaign campaing) {

    }
}

