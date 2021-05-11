package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;

public class SaleManager implements SaleService {

	@Override
	public void sale(Member member, Game game, Campaign campaign) {
		System.out.println("Oyun Fiyat�: "+ game.getUnitPrice() + " TL'dir.");
	    System.out.println(member.getFirstName()+ " "  + member.getLastName() + " adl� �ye " +        
				  game.getGameName() + " oyununu " + campaign.getCampaignName() +
				  " %"+campaign.getDiscount() + " indirim oran� ile sat�n ald�.");
	}
	
	
	

}
