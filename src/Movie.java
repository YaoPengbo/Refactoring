/**
 * Created by bobbyyyao on 2017/7/14.
 */
public class Movie {
    //儿童片
    public static final int CHILDRENS=0;
    //普通片
    public static final int REGULAR=1;
    //新片
    public static final int NEW_RELEASE=2;

    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPriceCode(int agrv) {
        switch (agrv){
            case REGULAR:
                price = new RegularPrice();
                break;
            case CHILDRENS:
                price = new ChildrenPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public int getPriceCode(){
        return price.getPriceCode();
    }

    public double getCharge(int iDayRented){
        /**
         * 租碟的价格是根据碟的类型进行计算的，
         * 一般的碟：
         * 2块钱起租赁，超过两天每天1块五
         * 新碟：
         * 每天三块
         * 儿童碟：
         * 不足四天都是1.5，超过四天(包括)每天1.5
         */
        double result = 0;
        //determine amounts for each line
        switch (getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (iDayRented > 2) {
                    result += (iDayRented - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                result += iDayRented * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (iDayRented > 3){
                    result += (iDayRented - 3) * 1.5;
                    break;
                }
        }
        return result;
    }

    public int getFrequentRenterPoints(int iDayRented){
        if ((getPriceCode() == Movie.NEW_RELEASE) && iDayRented > 1) {
            return 2;
        }else {
            return 1;
        }
    }
}

