package ECommerceSite.core.concretes;

import ECommerceSite.core.abstracts.ValidationService;
import ECommerceSite.entities.concrete.User;

public class ValidationManager implements ValidationService {
	
	@Override
	public void validationClick(User user) {
          System.out.println("�yelik tamamland�: "+user.getFirstName()+" "+user.getLastName());		
	}

	@Override
	public void validationMail(User user) {
		 System.out.println("Do�rulama e-postas� g�nderildi. L�tfen aktivasyon i�lemini tamamlay�n�z. ");
		
	}


	


}

