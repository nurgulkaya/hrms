package homeworkday2;

public class Main {

	public static void main(String[] args) {
		Movie movie1=new Movie(1, "Kill Bill:Volume 1", "Quentin Tarantino", "Martial Arts" );
		Movie movie2=new Movie(2, "Rear Window", "Alfred Hitchcock", "Mystery/Thriller" );		
		Movie movie3=new Movie(3, "Spirited Away", "Hayao Miyazaki", "Animation" );

        
		Movie [] movies= {movie1, movie2, movie3};
		for(Movie movie: movies) {
			System.out.println(movie.name);
		}
		
		
		MovieManager movieManager=new MovieManager();
		
		movieManager.selectMovie(movie3);
		movieManager.voteMovie(movie3);
				

	}

}

