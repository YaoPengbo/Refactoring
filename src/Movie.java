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

    private String _title;
    private Price _price;

    public Movie(String _title, int priceCode) {
        this._title = _title;
        setPriceCode(priceCode);
    }
    public String get_title() {
        return _title;
    }
    public void set_title(String _title) {
        this._title = _title;
    }

    public void setPriceCode(int agrv) {
        switch (agrv){
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENS:
                _price = new ChildrenPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public int getPriceCode(){
        return _price.getPriceCode();
    }

    public double getCharge(int iDayRented){
        return _price.getCharge(iDayRented);
    }

    public int getFrequentRenterPoints(int iDayRented){
        return _price.getFrequentRenterPoints(iDayRented);
    }
}

