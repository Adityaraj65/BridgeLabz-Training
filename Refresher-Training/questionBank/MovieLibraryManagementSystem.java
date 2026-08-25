package questionBank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Movie{
	String movieName;
	int movieId;
	Movie(String movieName,int movieId){
		this.movieName=movieName;
		this.movieId=movieId;
	}
	public int getMovieId() {
		return movieId;
		
	}
	public String getMovieName() {
		return movieName;
	}
}
class MovieUtil{
	List<Movie>movieList=new ArrayList<>();
	public void addMovie(Movie m) {
		movieList.add(m);
		System.out.println("movie added");
	}
	public void removeMovie(int id) {
		for(int i=0;i<movieList.size();i++){
			if(movieList.get(i).getMovieId()==id) {
				System.out.println("movie removed : "+movieList.get(i).getMovieName());
				movieList.remove(i);

				return;
			}
		}
		System.out.println("movie not found");
	}
	public void getAllMovie() {
		for(Movie l:movieList) {
			System.out.println("movie name: "+l.getMovieName()+" movieId : "+l.getMovieId());
		}
	}
}
public class MovieLibraryManagementSystem {
	public static void main(String[] args) {
		MovieUtil m=new MovieUtil();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of movie you want to add");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("enter movie id");
			int id=sc.nextInt();
			System.out.println("enter movie name");
			String movieName=sc.next();
			Movie m1=new Movie(movieName, id);
			m.addMovie(m1);
		}
		System.out.println("getting all movie before removal");
		m.getAllMovie();
		System.out.println("enter movie id that you want to delete");
		int movieId=sc.nextInt();
		m.removeMovie(movieId);
		
		System.out.println("getting all movie after removal");
		m.getAllMovie();
	}
	
}
