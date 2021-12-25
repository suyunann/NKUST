package shopeeCrawler.modle;

import java.lang.ref.PhantomReference;
import java.util.*;
//newbalance 商品內容
public class Content {
    private String Url;//商品網址
    private String MerchandiseName;//商品名稱
    private String Rate;//評價
    private String RateStar;//評價星星數
    private String Price;//商品價格
    private String Size;//鞋子尺吋
    private String cusRate;//客人評價


    public Content(String Url, String MerchandiseName, String Rate, String RateStar, String Price, String Size, String cusRate) {
        this.Url = Url;
        this.MerchandiseName = MerchandiseName;
        this.Rate = Rate;
        this.RateStar = RateStar;
        this.Price = Price;
        this.Size = Size;
        this.cusRate = cusRate;
    }

    public String getUrl() {
        return Url;
    }

    public String getMerchandiseName() {
        return MerchandiseName;
    }

    public String getRate() {
        return Rate;
    }

    public String getRateStar() {
        return RateStar;
    }

    public String getPrice() {
        return Price;
    }

    public String getSize() {
        return Size;
    }

    public String getCusRate() {
        return cusRate;
    }

    @Override
    public String toString() {
        return String.format("Content{Url='%s',MerchandiseName='%s',Rate='%s',RateStar='%s',Price='%s',Size'%s',cusRate'%s'}", Url, MerchandiseName, Rate, RateStar, Price, Size, cusRate);
    }

}
