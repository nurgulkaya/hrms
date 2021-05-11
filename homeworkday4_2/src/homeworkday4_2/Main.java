package homeworkday4_2;

import Abstract.CampaignService;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.MemberManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;


public class Main {

	

	public static void main(String[] args) {
		
     	MemberManager memberManager = new MemberManager();
		CampaignManager campaignManager = new CampaignManager();
		GameManager gameManager = new GameManager();
		SaleManager saleManager = new SaleManager();
			
		
		Game game = new Game();
		game.setId(1);
		game.setGameName("Tekken");
		game.setUnitPrice(200);
		
	    gameManager.gameAttribute(game);

	    
        Member member = new Member();
        member.setId(2);
		member.setFirstName("Ayþe");
		member.setLastName("Sezer");
		member.setDateOfBirth(1998);
		member.setNationalityId( "22334455660");
		member.setMail("def@gmail.com");
		
		memberManager.addMember(member);
	    memberManager.updateMember(member);
	    memberManager.deleteMember(member);

        
		Campaign campaign = new Campaign();
		campaign.setId(2);
		campaign.setCampaignName("Bahar Kampanyasý");
		campaign.setDiscount(20);
	
	    campaignManager.addCampaign(campaign);
	    campaignManager.updateCampaign(campaign);
	    campaignManager.deleteCampaign(campaign);

	    
       saleManager.sale(member, game, campaign);
		
	}

}
