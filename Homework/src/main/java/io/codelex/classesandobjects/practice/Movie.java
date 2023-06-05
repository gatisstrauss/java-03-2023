package io.codelex.classesandobjects.practice;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    String title;
    String studio;
    String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public String getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }

    static Movie[] getPG(Movie[] movies) {
        List<Movie> pgMovies = new ArrayList<>();

        for (Movie movie : movies) {
            if (movie.getRating().equals("PG")) {
                pgMovies.add(movie);
            }
        }
        return pgMovies.toArray(new Movie[0]);

    }
}
