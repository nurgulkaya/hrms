package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {
 
	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("Yeni Kampanya: " + campaign.getCampaignName() + "\n" + 
				           "Kampanya oraný: %" + campaign.getDiscount());	
	}
	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Silinecek Kampanya: " + campaign.getCampaignName());
    }
	@Override
    public void updateCampaign(Campaign campaign) {
    	System.out.println("Güncellenecek Kampanya: " + campaign.getCampaignName() + "\n" +
		                   "Yeni Kampanya oraný: %" + campaign.getDiscount());
    }
	
	
	
}
