package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;

public class SaleManager implements SaleService {

	@Override
	public void sale(Member member, Game game, Campaign campaign) {
		System.out.println("Oyun Fiyatý: "+ game.getUnitPrice() + " TL'dir.");
	    System.out.println(member.getFirstName()+ " "  + member.getLastName() + " adlý üye " +        
				  game.getGameName() + " oyununu " + campaign.getCampaignName() +
				  " %"+campaign.getDiscount() + " indirim oraný ile satýn aldý.");
	}
	
	
	

}
