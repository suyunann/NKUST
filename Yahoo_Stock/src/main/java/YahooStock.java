import com.sun.tools.jconsole.JConsolePlugin;
import org.json.JSONArray;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.json.*;

import javax.print.Doc;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/*
https://tw.stock.yahoo.com/    Yahoo 股市//第一層

        https://tw.stock.yahoo.com/class/ 上市類股//第二層

        https://tw.stock.yahoo.com/class-quote?sectorId=40&exchange=TAI     半導體分類行情//第三層


        https://yfapi.net/v6/finance/quote?region=US&lang=en&symbols=AAPL%2CBTC-USD%2CEURUSD%3DX  Yahoo Finance API
        X-API-KEY: Xgz6obG7Nl4G8hS3I81eP1A4qr4OlTCq9DMoI0t0

        */

/*API endpoints
The Yahoo Finance API provides 11 endpoints, each of which covers a specific feature that you can use:
/v6/finance/quote - real time quote data for stocks, ETFs, mutuals funds, bonds, crypto and national currencies.
/v7/finance/options - option chains data for a particular stock market company
/v8/finance/spark - historical data for various intervals and ranges
/v11/finance/quoteSummary - very detailed information for a particular ticker symbol
/v8/finance/chart - chart data
/v6/finance/recommendationsbysymbol - list of similar stocks
/ws/screeners/v1/finance/screener/predefined/saved - list of most added stocks to the watchlist
/ws/insights/v1/finance/insights - research insights
/v6/finance/autocomplete - auto complete stock suggestions
/v6/finance/quote/marketSummary - live market summary information at the request time
/v1/finance/trending - trending stocks in a specific region

https://polygon.io/docs/stocks/get_v1_meta_symbols__stocksTicker__company Ticker Details
https://api.polygon.io/v1/meta/symbols/AAPL/company?apiKey=ul8wIcbn2k9cc3xdDNnIbyFNJI3f3yLn APPL

 */
public class YahooStock {


    public static void main(String[] args) {
           /*try {
               //new JSONObject(new JSONTokener(new FileInputStream(new File("path"), "UTF-8")));
               //new JSONObject(new JSONTokener(new FileReader("path")));
               String json = Jsoup.connect("https://api.polygon.io/v1/meta/symbols/AAPL/company?apiKey=ul8wIcbn2k9cc3xdDNnIbyFNJI3f3yLn").ignoreContentType(true).execute().body();
               //format json by https://jsoneditoronline.org/
               System.out.println(json);
               JSONArray resArray = new JSONArray(json);
               for (int i = 0; i < resArray.length(); i++)
               {
                   String title = resArray.getJSONObject(i).getString("name");
                  // String ceo = resArray.getJSONObject(i).getString("ceo");
                   System.out.println(title);
                  // System.out.println(ceo);
               }
           } catch (Exception e) {
               System.out.println(e);
           }
       }
   }*/


        try {
            Document doc = Jsoup.connect("https://tw.stock.yahoo.com/ ").get();//首頁

            Elements FirstTitle = doc.getElementsByClass("_yb_sb4pm _yb_18rvs");//首頁Class
            Element head = FirstTitle.get(0);//存到head變數裡
            String title = head.getElementsByClass("_yb_1edlg").get(0).text();//抓"當日行情"標題名稱
            Elements FirstTitleName = doc.select("#ybar-navigation > div > ul > li:nth-child(3) > a");//抓上市類股網址(copy slector)
            Element a = FirstTitleName.get(0);//存到a變數裡
            System.out.println(title);
            Document doc1 = Jsoup.connect(a.absUrl("href")).get();//從變數a裡提取"當日行情"網址

            Elements SecondTitleName = doc1.select("#LISTED_STOCK > div > ul > li:nth-child(3) > div:nth-child(4) > a");//抓"半導體"網址
            Element b = SecondTitleName.get(0);//存入變數b裡


            Document doc2 = Jsoup.connect(b.absUrl("href")).get();//半導體頁面
            Elements ThirdTitleName = doc2.select("#main-1-ClassQuotesTable-Proxy");//要抓的資料迴圈
//"#main-1-ClassQuotesTable-Proxy"
            //List(n)

//Pos(r) Ov(h) ClassQuotesTable


            for (Element c : ThirdTitleName) {
                String timee = c.getElementsByClass("C(#6e7780) Fz(14px) As(fe)").get(0).text();//資料時間
                System.out.println(timee);
                int stockPlus = 0;
                int stockpercent = 0;
                for (int i = 0; i <= 4; i++) {


                    // System.out.println("股票名稱 "+"股票代號 "+"股價 "+" 漲跌 "+" 漲跌趴數 "+"開盤 "+"收盤 "+"最高 "+"最低 "+"成交量 "+"時間 ");

                    //String  TrendVariable=c.getElementsByClass("");

                    String StockName = c.getElementsByClass("Lh(20px) Fw(600) Fz(16px) Ell").get(i).text();//股票名字
                    String StockCodeNum = c.getElementsByClass("Fz(14px) C(#979ba7) Ell").get(i).text();//股票代號

                    String StockPrice = c.getElementsByClass("Fxg(1) Fxs(1) Fxb(0%) Ta(end) Mend($m-table-cell-space) Mend(0):lc Miw(68px)").get(5 + stockPlus).text();//股價 5
                    String StockUpandDown = c.getElementsByClass("Fxg(1) Fxs(1) Fxb(0%) Ta(end) Mend($m-table-cell-space) Mend(0):lc Miw(74px)").get(2 + stockpercent).text();//漲跌 2
                    String StockPercentage = c.getElementsByClass("Fxg(1) Fxs(1) Fxb(0%) Ta(end) Mend($m-table-cell-space) Mend(0):lc Miw(74px)").get(3 + stockpercent).text();//漲跌趴數 3
                    String StockOpening = c.getElementsByClass("Fxg(1) Fxs(1) Fxb(0%) Ta(end) Mend($m-table-cell-space) Mend(0):lc Miw(68px)").get(6 + stockPlus).text();//開盤 6
                    String StockClosing = c.getElementsByClass("Fxg(1) Fxs(1) Fxb(0%) Ta(end) Mend($m-table-cell-space) Mend(0):lc Miw(68px)").get(7 + stockPlus).text();// 7
                    String StockHighest = c.getElementsByClass("Fxg(1) Fxs(1) Fxb(0%) Ta(end) Mend($m-table-cell-space) Mend(0):lc Miw(68px)").get(8 + stockPlus).text();// 8
                    stockPlus = stockPlus + 5;
                    stockpercent = stockpercent + 2;
                    //System.out.println(StockHighest);

                    //String List = c.getElementsByClass("List(n)").get(i+1).text();

                    //System.out.println("   "+list);
                    System.out.println("\n" + "股票名稱：" + StockName + " 股票代號：" + StockCodeNum + " 股價：" + StockPrice + " 漲跌：" + StockUpandDown + " 漲跌趴數：" + StockPercentage + " 開盤：" + StockOpening + " 收盤：" + StockClosing + " 最高：" + StockHighest);

//10000000000
                }
            }


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}