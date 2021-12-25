package config;
//Shopee 網址存放
import shopeeCrawler.modle.Elements;
import java.util.*;

public class config {
    public static final String Shopee_Url = "https://shopee.tw/shop";//爬newbalance
    public static final Map<String, Elements> ELEMENTS_MAP = new HashMap<>() {{

/*
    New Balance：https://shopee.tw/newbalance.tw
    所有商品網址： https://shopee.tw/shop/131441298/search?page=0
    新品專區網址：https://shopee.tw/shop/131441298/search?page=0&shopCollection=139635630

 */
                put("collection", new Elements(
                        "/131441298/search?page=0",
                        "New Balance 官方旗艦店",
                        "31.2萬",
                        "5.0",
                        "1,462",
                        "34個月前",
                        "96%"
                        )
        );


    }};

}
