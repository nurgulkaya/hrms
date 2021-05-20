package ECommerceSite.business.abstracts;

import ECommerceSite.entities.concrete.User;

public interface CheckUserService {
	 boolean checkName(User user);
	 boolean checkLastName(User user);
     boolean checkMailRegex(String mail);
     boolean checkMail(User user);
     boolean checkPassword(User user);
	
}
