/**
 * Created by bobbyyyao on 2017/7/21.
 */
public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int iDayRented);

    public int getFrequentRenterPoints(int iDayRented){
        return 1;
    }
}
