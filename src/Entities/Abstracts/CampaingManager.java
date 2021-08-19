package Entities.Abstracts;

import Entities.concretes.Campaign;



public interface CampaingManager {
    void add(Campaign campaing);
    void delete(Campaign campaing);
    void update(Campaign campaing);

}
