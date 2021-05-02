package homeworkday3;

public class Student extends User {
	private String lessons;
	 
	public Student() {
		 
	} 
	public Student(int id, String firstName,String lastName, String email, 
			String password, String lessons) {
	    super(id, firstName, lastName, email, password);
	    this.lessons = lessons;
	}

	public String getLessons() {
		return lessons;
	}
	public void setLessons(String lessons) {
		this.lessons = lessons;
	}

	
	
	
	 
}
