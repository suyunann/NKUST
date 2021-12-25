package shopeeCrawler.modle;
//newbalance 網頁內容
public class Elements {
    private String Url;//蝦皮網址
    private String CommodityName;//類別名稱
    private String fans;//粉絲數
    private String rate;//評價
    private String sells;//商品數量
    private String joinTime;//加入時間
    private String chat;//聊聊表現

    public Elements(String Url, String CommodityName,String fans,String rate,String sells,String joinTime,String chat) {
        this.Url = Url;
        this.CommodityName = CommodityName;
        this.fans=fans;
        this.rate=rate;
        this.sells=sells;
        this.joinTime=joinTime;
        this.chat=chat;

    }

    public String getUrl(){
        return Url;
    }

    public String getCommodityName() {
        return CommodityName;
    }
    public String getFans(){
        return fans;
    }

    public String getRate() {
        return rate;
    }

    public String getSells() {
        return sells;
    }

    public String getJoinTime() {
        return joinTime;
    }

    public String getChat() {
        return chat;
    }
}
