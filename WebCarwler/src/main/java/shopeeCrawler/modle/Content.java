package shopeeCrawler.modle;

public class Content {
    private String Url;//商品網址
    private String MerchandiseName;//商品名稱
    private String Rate;//評價
    private String Price;//商品價格

    public Content(String Url,String MerchandiseName,String Rate,String Price){
        this.Url=Url;
        this.MerchandiseName=MerchandiseName;
        this.Rate=Rate;
        this.Price=Price;
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

    public String getPrice() {
        return Price;
    }

    @Override
    public String toString(){
        return String.format("Content{Url='%s',MerchandiseName='%s',Rate='%s',Price='%s'}",Url,MerchandiseName,Rate,Price);
    }

}
