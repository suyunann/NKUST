import java.util.*;
import config.config;
import shopeeCrawler.modle.*;

import okhttp3.*;
import org.jsoup.*;
import org.jsoup.nodes.*;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class main {

    private OkHttpClient okHttpClient;
    private final Map<String, List<Cookie>> cookieStore; // 保存 Cookie
    private final CookieJar cookieJar;
    public main() throws IOException {
        /* 初始化 */
        cookieStore = new HashMap<>();
        cookieJar = new CookieJar() {
            /* 保存每次伺服器端回傳的 Cookie */
            @Override
            public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
                List<Cookie> cookies = cookieStore.getOrDefault(httpUrl.host(), new ArrayList<>());
                cookies.addAll(list);
                cookieStore.put(httpUrl.host(), cookies);
            }

            /* 每次發送帶上儲存的 Cookie */
            @Override
            public List<Cookie> loadForRequest(HttpUrl httpUrl) {
                return cookieStore.getOrDefault(httpUrl.host(), new ArrayList<>());
            }
        };
        okHttpClient = new OkHttpClient.Builder().cookieJar(cookieJar).build();

        /* 獲得網站的初始 Cookie */
        Request request = new Request.Builder().get().url(config.Shopee_Url).build();
        okHttpClient.newCall(request).execute();
    }

}





