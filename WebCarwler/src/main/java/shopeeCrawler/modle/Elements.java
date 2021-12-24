package shopeeCrawler.modle;

public class Elements {
    private String Url;//蝦皮網址
    private String CommodityName;//類別名稱

    public Elements(String Url, String CommodityName) {
        this.Url = Url;
        this.CommodityName = CommodityName;


    }

    public String getUrl(){
        return Url;
    }

    public String getCommodityName() {
        return CommodityName;
    }


}
