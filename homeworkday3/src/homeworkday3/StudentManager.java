package homeworkday3;


public class StudentManager extends UserManager{
	
     public void addLesson(Student student) {
		System.out.println(student.getFirstName() + student.getLastName() + student.getLessons() + " kursunu ekledi.");
	}
     public void deleteLesson(Student student) {
	    System.out.println(student.getFirstName() + student.getLastName() + student.getLessons() + " kursunu sildi.");
	}
	 
	 
	    		
}
