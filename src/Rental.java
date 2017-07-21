/**
 * Created by bobbyyyao on 2017/7/21.
 */
public class Rental {
    private Movie movie;
    private int dayRented;
    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }
    public Movie getMovie() {
        return movie;
    }
    public int getDaysRented() {
        return dayRented;
    }
}
