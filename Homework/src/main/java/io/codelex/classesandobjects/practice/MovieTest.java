package io.codelex.classesandobjects.practice;


public class MovieTest {
    public static void main(String[] args) {
        Movie[] movies = {
                new Movie("Casino Royale", "Eon Productions", "PG-13"),
                new Movie("Glass", "Buena Vista International", "PG-13"),
                new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG")
        };

        Movie[] pgMovies = Movie.getPG(movies);
        for (Movie movie : pgMovies) {
            System.out.println("Title: " + movie.getTitle());
            System.out.println("Studio: " + movie.getStudio());
            System.out.println("Rating: " + movie.getRating());
            System.out.println();
        }
    }
}