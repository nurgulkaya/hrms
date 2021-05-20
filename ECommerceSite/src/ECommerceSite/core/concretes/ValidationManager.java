package ECommerceSite.core.concretes;

import ECommerceSite.core.abstracts.ValidationService;
import ECommerceSite.entities.concrete.User;

public class ValidationManager implements ValidationService {
	
	@Override
	public void validationClick(User user) {
          System.out.println("Üyelik tamamlandý: "+user.getFirstName()+" "+user.getLastName());		
	}

	@Override
	public void validationMail(User user) {
		 System.out.println("Doðrulama e-postasý gönderildi. Lütfen aktivasyon iþlemini tamamlayýnýz. ");
		
	}


	


}

