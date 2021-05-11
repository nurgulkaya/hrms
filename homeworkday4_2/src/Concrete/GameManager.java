package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void gameAttribute(Game game) {
		System.out.println("Oyun ID: " + game.getId() + "\n" + 
				           "Oyun ad�: " + game.getGameName() + "\n" + 
		                   "Oyun Fiyat�: " + game.getUnitPrice());
		

	}

}
