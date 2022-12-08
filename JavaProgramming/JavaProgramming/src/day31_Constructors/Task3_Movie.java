package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

    public class Task3_Movie {
    public String country, title, genre, releaseDate, director;
    public ArrayList<String> casts;

    public Task3_Movie(String country, String title, String genre, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    public void addCast (String name) {
        casts.add(name);
    }
    public void addCasts (String [] names) {
        casts.addAll(Arrays.asList(names));
    }

    public String toString() {
        return "Task3_Movie{" +
                "Country = '" + country + '\'' +
                ", Title = '" + title + '\'' +
                ", Genre = '" + genre + '\'' +
                ", Release Date = '" + releaseDate + '\'' +
                ", Director = '" + director + '\'' +
                ", Casts = " + casts +
                '}';
    }

}
