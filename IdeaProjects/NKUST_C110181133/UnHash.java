import java.text.Format;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class UnHash {

    public static void main (String[] args) {
        System.out.println(revHash(6933552791181934L));
        System.out.println(hash("justdoit")); //574318821802
    }

    public static String letters = "cdefghijlmnoqstuvxz";

    public static String revHash(long hash) {
        ArrayList <Character> figure = new ArrayList<Character>();
        ArrayList <Character> contray = new ArrayList<Character>();
        long a = 6933552791181934L;
        long b ;

        for (int i = 0; i <= letters.length() ; i++) {
            b = (a - i) % 23 ;
            if (b == 0){
                a = (a - i) / 23;
                figure.add(letters.charAt(i));
                i = 0;
            }
        }
        for (int i = 0; i <= letters.length() ; i++) {
            b = (a - i) % 23 ;
            if (b == 0){
                a = (a - i) / 23;
                figure.add(letters.charAt(i));
                i = 0;
            }
            if (a <= 7){
                break;
            }
        }

        int size = figure.size();
        for (int i = size - 1; i >= 0 ; i--) {
            contray.add(figure.get(i));
        }
        /*for (Character i : contray) {
            System.out.println(i);
        }*/
        String result = new String();
        for (int i = 0; i < size ; i++) {
            result = result + contray.get(i);
        }
        return result;

    }

    public static long hash(String s){
        long h = 7;
        for (int i = 0; i < s.length(); i++){
            h = h * 23 + letters.indexOf(s.charAt(i));
        }
        return h;
    }
}
