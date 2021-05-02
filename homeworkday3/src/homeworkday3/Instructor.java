package homeworkday3;

public class Instructor extends User {
   private String coursesInstructor;
	 
	public Instructor() {
		
	}  
	public Instructor(int id, String firstName,String lastName, String email, 
			String password, String coursesInstructor) {
		super(id, firstName, lastName, email, password);
        this.coursesInstructor = coursesInstructor;
	}

	public String getCoursesInstructor() {
		return coursesInstructor;
	}

	public void setCoursesInstructor(String coursesInstructor) {
		this.coursesInstructor = coursesInstructor;
	}  
}
