/**
 * Created by bobbyyyao on 2017/7/21.
 */
public class RegularPrice extends Price{
    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    public double getCharge(int iDayRented){
        double result = 2;
        if (iDayRented > 2) {
            result += (iDayRented - 2) * 1.5;
        }
        return result;
    }
}
