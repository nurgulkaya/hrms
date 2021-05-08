package homeworkday4_1;

import Entities.Customer;
import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {
    
       BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
	   customerManager.Save( new Customer (1, "Nurgül", "Kaya", 2001, "13858498578"));
       
       
	}
	
}
