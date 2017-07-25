/**
 * Created by bobbyyyao on 2017/7/21.
 */
public class ChildrenPrice extends Price{
    @Override
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    public double getCharge(int iDayRented){
        double result = 1.5;
        if (iDayRented > 3) {
            result += (iDayRented - 3) * 1.5;
        }
        return result;
    }
}
