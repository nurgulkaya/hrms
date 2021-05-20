package ECommerceSite;


import ECommerceSite.business.abstracts.UserService;
import ECommerceSite.business.concretes.CheckUserManager;
import ECommerceSite.business.concretes.UserManager;
import ECommerceSite.core.concretes.ValidationManager;
import ECommerceSite.dataAccess.concretes.HibernateUserDao;
import ECommerceSite.entities.concrete.User;


public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new ValidationManager() , new CheckUserManager(), 
				new HibernateUserDao());
		
	    User user1 = new User(1,"Ayþe", "Bursa", "abc@gmail.com","123456");
	    //User user2 = new User(2,"Ali", "Denizli", "cba@gmail.com","12345");
	    userService.signIn(user1);
	    //userService.signIn(user2);

	}

}
