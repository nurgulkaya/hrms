package homeworkday2;

public class MovieManager {
	  
	public void selectMovie(Movie movie) {
		System.out.println("Film seç: "+movie.name);
	}
	
	public void voteMovie(Movie movie) {
		System.out.println("Bu filme oy ver: "+movie.name);
	}
}
