package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Member;

public interface SaleService {
        
	void sale(Member member, Game game, Campaign campaign);
	
	
	
}
