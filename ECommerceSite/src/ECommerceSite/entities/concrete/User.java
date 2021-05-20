package ECommerceSite.entities.concrete;

public class User {
     private int userId; 
     private String firstName;
     private String lastName;
     private String userMail;
     private String userPassword;
     
    public User() {
    	
    }
	public User(int userId, String firstName, String lastName, String userMail, String userPassword) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userMail = userMail;
		this.userPassword = userPassword;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
    public String getUserPassword() {
	    return userPassword;
    }
    public void setUserPassword(String userPassword) {
	    this.userPassword = userPassword;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	
	  public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

     
     
}
