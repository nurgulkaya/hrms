package ECommerceSite.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import ECommerceSite.business.abstracts.CheckUserService;
import ECommerceSite.dataAccess.abstracts.UserDao;
import ECommerceSite.entities.concrete.User;

public class CheckUserManager implements CheckUserService {
	private UserDao userDao;
	private List <User> users = new ArrayList<User>(); 
	
	public CheckUserManager(UserDao userDao) {
	super();
	this.userDao = userDao;
   }
   
	public CheckUserManager() {
		
	}

	public static final String MailPattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.\\.[A-Za-z]{2,})$";  
		  
	@Override
	public boolean checkName(User user) {
		if(user.getFirstName().length() < 2) {
			 System.out.println("Ad ve soyad en az 2 karakterden oluþmalýdýr.");
			 return false;
		 }else{
			 this.userDao.add(user);
			 return true;	 
			 
	  }	
	}
	@Override
	public boolean checkLastName(User user) {
		if(user.getLastName().length() < 2) {
			 System.out.println("Ad ve soyad en az 2 karakterden oluþmalýdýr!");
			 return false;
		 }else{
			 this.userDao.add(user);
			 return true;
	  }	
	}
	
	@Override
	public boolean checkMailRegex(String mail) {	
			Pattern pattern = Pattern.compile(MailPattern,
			Pattern.CASE_INSENSITIVE);
			return pattern.matcher(mail).find();
	}
	@Override
	public boolean checkMail(User user) {
		for(User us : users) {
		if(user.getUserMail()==us.getUserMail()) {
			 System.out.println("Bu E-Posta kullanýlýyor. "
			 		+ "Lütfen Baþka bir E-Posta giriniz!");
			return false;
		}else {
			this.userDao.add(user);
	    }
	  } 
		return true;
	}

	@Override
	public boolean checkPassword(User user) {
		if(user.getUserPassword().length() < 6) {
			System.out.println("Þifreniz en az 6 karakterden oluþmalýdýr!");
			 return false;
		 }else{
			 this.userDao.add(user); 
			 return true;
		 }
			 
	}
}
