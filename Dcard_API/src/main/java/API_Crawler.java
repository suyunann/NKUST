import org.json.*;
import org.jsoup.Jsoup;


/*
https://www.dcard.tw/service/api/v2/forums/car/posts Dcard 車車版
https://tw.stock.yahoo.com/    Yahoo 股市//第一層

https://tw.stock.yahoo.com/class/ 上市類股//第二層

https://tw.stock.yahoo.com/class-quote?sectorId=40&exchange=TAI     半導體分類行情//第三層

 */

public class API_Crawler {
    public static void main(String[] args) {
        try {
                String json = Jsoup.connect("https://www.dcard.tw/service/api/v2/forums/car/posts").ignoreContentType(true).execute().body();
            //format json by https://jsoneditoronline.org/
            System.out.println(json);

            JSONArray resArray = new JSONArray(json);
            for (int i = 0; i < resArray.length(); i++)
            {
                String title = resArray.getJSONObject(i).getString("exchange");
                String boardName = resArray.getJSONObject(i).getString("forumName");
                System.out.println("標題："+title);
                System.out.println("版名："+boardName);
            }
        } catch (Exception e) {
            System.out.println(e);
        }



    }
}
