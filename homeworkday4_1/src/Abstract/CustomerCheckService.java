package Abstract;

import Abstract.CustomerCheckService;
import Entities.Customer;

public interface  CustomerCheckService{
	boolean CheckIfRealPerson(Customer customer);
	
}
