package homeworkday3;


public class UserManager {
	
	 public void login(User user) {
    	 System.out.println(user.getFirstName()  + user.getLastName()  + " kursa giriþ yaptý. ");
	 }
	 
     public void logout(User user) {
    	 System.out.println(user.getFirstName()  + user.getLastName() + " kurstan çýktý. ");
     }
     
     public void signup(User user) {
    	 System.out.println(user.getFirstName()  + user.getLastName()  + " kursa kayýt oldu. ");
	 }
     
     public void deleteSign(User user) {
    	 System.out.println(user.getFirstName() + user.getLastName() + " kurstan kaydýný sildi. ");
     }
    
	
 }
