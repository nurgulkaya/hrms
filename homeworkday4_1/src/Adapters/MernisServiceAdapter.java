package Adapters;


import java.rmi.RemoteException;

import com.sun.tools.javac.util.Convert;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
        boolean value = false;

        KPSPublicSoap proxy = new KPSPublicSoapProxy();
		 
		try {
			value = proxy.TCKimlikNoDogrula(Long.parseLong (customer.getNationalityId()), 
					                        customer.getFirstName().toUpperCase(), 
					                        customer.getLastName().toUpperCase(), 
					                        customer.getDateOfBirth());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}

}
