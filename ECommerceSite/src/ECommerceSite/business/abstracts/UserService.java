package ECommerceSite.business.abstracts;

import ECommerceSite.entities.concrete.User;

public interface UserService {
  	  void signIn(User user);
      void login(String mail, String password);
      void loginGoogle(String mail, String password);
      
     
}
