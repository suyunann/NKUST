import java.util.HashSet;
import java.util.ArrayList;
public class HashNum {

    public static void main(String[] args) {
        ArrayList<String> figure = new ArrayList<String>();
        HashSet<String> figure1 = new HashSet<String>();
        ArrayList<String> total = new ArrayList<String>();
        figure.add("0");
        figure.add("0");
        figure.add("1");
        figure.add("1");
        figure.add("1");
        figure.add("2");
        figure.add("2");
        figure.add("3");
        figure.add("3");
        figure.add("4");
        int a = figure.size();
        for (String  i :figure) {
            figure1.add(i);
        }

        int b = figure1.size() ;
        int c = a - b;

        for (String x :figure1) {
            total.add(x);
        }

        for (int i = 0; i < c;i++) {
            total.add("_");
        }
        System.out.println(total);
    }


}
