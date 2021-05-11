package Concrete;

import Abstract.PersonService;
import Entities.Member;

public class CheckPersonManager implements PersonService {

	@Override
	public boolean Person(Member member) {
		
		return true;
	}
         
}
