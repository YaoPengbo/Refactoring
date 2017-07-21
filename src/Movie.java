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
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    public int getPriceCode(){
        return priceCode;
    }

}

