package day31_Constructors;

public class Task3_MovieObjects {
    public static void main(String[] args) {

        Task3_Movie movie = new Task3_Movie("USA", "Journey to SDET: Cydeo EU10", "Adventure, Comedy, Thriller", "09/03/2022", "Kuzzat Altay");

        movie.addCast("Asiya");

        String [] casts = {"Muhtar", "Adam", "Nadir", "Zulpikar", "Icell"};
        movie.addCasts(casts);


        System.out.println(movie);


    }
}
