package ECommerceSite.business.concretes;


import ECommerceSite.business.abstracts.CheckUserService;
import ECommerceSite.business.abstracts.UserService;
import ECommerceSite.core.abstracts.ValidationService;
import ECommerceSite.dataAccess.abstracts.UserDao;
import ECommerceSite.entities.concrete.User;

  public class UserManager implements UserService {
	private ValidationService validationService;
	private CheckUserService checkUserService;
	private UserDao userDao;
	

	public UserManager(ValidationService validationService, CheckUserService checkUserService, UserDao userDao) {
		super();
		this.validationService = validationService;
		this.checkUserService = checkUserService;
		this.userDao = userDao;
	}

	@Override
	public void signIn(User user) {
		CheckUserService checkUserService = new CheckUserManager(userDao);
		
		if(checkUserService.checkName(user)) {
			System.out.println("");
		}else {
			return;
		}
		if(checkUserService.checkLastName(user)) {
			System.out.println("");
		}else {
			return;
		}
		if(checkUserService.checkMail(user)) {
			System.out.println("");
		}else {
			return;
		}
		if(checkUserService.checkPassword(user)) {
			System.out.println("");
			return;
		}
	  
		userDao.add(user);
	    System.out.println("Kayýt yapýldý.");
	
	   validationService.validationMail(user);
	   validationService.validationClick(user);
	   
	 

	}
	@Override
	public void login(String mail, String password) {
		for (User user: userDao.getAll()) {
			if(mail==user.getUserMail() && password==user.getUserPassword()) {
				System.out.println("Giriþ yapýldý: "+user.getFirstName()+" "+user.getLastName());
			}
		}
		
	}

	@Override
	public void loginGoogle(String mail, String password) {
        return;
	}

}
