import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.print.Doc;
import java.nio.charset.StandardCharsets;

public class spider {
        public static  void  main(String[] args ){

    try {
        Document doc = Jsoup.connect("https://www.ptt.cc/bbs/index.html").get();

        Elements Headlines = doc.getElementsByClass("b-ent");//First Board
        for (Element head : Headlines){
            String title = head.getElementsByClass("board-title").get(0).text();
            System.out.println("標題:" + title);
            String urlName = head.getElementsByClass("board-name").get(0).text();////get next page's URL name;//"Baseball";//

            //-------
           // System.out.println(urlName);
            Document BoardUrl = Jsoup.connect("https://www.ptt.cc/bbs/" + urlName + "/index.html").get();
            Elements contents = BoardUrl.select("#main-container div.r-list-container.action-bar-margin.bbs-screen a");
            //System.out.println(BoardUrl);

                for (Element content :contents){
                Elements Url = BoardUrl.getElementsByClass("r-ent");

                //System.out.println("hi");
                for (Element title2 : Url){
                    Document a = Jsoup.connect(content.absUrl("href")).get();
                    //System.out.println(title2.);
                    //System.out.println(content.absUrl("href"));
                    Elements push = a.getElementsByClass("push");
                    for (Element fu : push){
                         String b = fu.getElementsByClass("push").get(0).getElementsByTag("span").get(2).text();
                         System.out.println("留言" + b);

        break;
                    }
        break;
                }

                    break;
            }
            //break;
        }










        /*Document doc = Jsoup.connect("https://www.ptt.cc/bbs/index.html").get();
        Elements newsHeadlines = doc.select("#main-container  div.title  a");
        Element artUrl = newsHeadlines.get(0);
        String a =artUrl.absUrl("href");
        Document com = Jsoup.connect(a).get();
        //System.out.println(a);

        Elements comments = com.getElementsByClass("#main-content  div:nth-child(8)");

        System.out.println("標題：" + doc.title());
        String date = doc.getElementsByClass("date").get(0).text();
        System.out.println("日期:"+date);

        for (Element headline : newsHeadlines) {
                //System.out.println(headline.addClass("f3 push-content").getElementsByTag("span").get(0));
                System.out.println(headline.text());
                System.out.println(headline.attr("title"));
                //System.out.println(headline.absUrl("href"));
                //
        }
        for (Element comment : comments) {
            String push = com.getElementsByClass("push").get(0).getElementsByTag("span").get(3).text();
            System.out.println(comment.text());
            System.out.println("留言:"+push);
        }




         Elements rents = doc.getElementsByClass("r-ent");

        for(Element rent : rents){
            String num = rent.getElementsByTag("span").get(0).text();
            String title = rent.getElementsByClass("title").get(0).getElementsByTag("a").get(0).text();
            System.out.println("排序"+num);
            System.out.println("Title:"+title);


        }
       Elements contents = doc.getElementsByClass("bbs-screen bbs-content");
        for(Element content : contents){

            String comment = content.getElementsByClass("push").get(0).getElementsByTag("span").get(0).text();
            System.out.println(comment);
        }*/

    }catch(Exception p){
            System.out.println("Error>>>" + p);
        }


        }
    }


