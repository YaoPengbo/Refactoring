/**
 * Created by bobbyyyao on 2017/7/21.
 */
public class NewReleasePrice extends Price{
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    public double getCharge(int iDayRented){
        return iDayRented * 3;
    }

    public int getFrequentRenterPoints(int iDayRented){
        if ( iDayRented > 1) {
            return 2;
        }else {
            return 1;
        }
    }
}
