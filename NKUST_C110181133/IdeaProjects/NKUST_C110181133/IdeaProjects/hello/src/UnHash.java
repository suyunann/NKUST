public class UnHash {

    //import java.util.ArrayList;
    public static void main (String[] args) {
        //System.out.println(revHash(6933552791181934L));
        System.out.println(hash("justdoit")); //574318821802
    }

    public static String letters = "cdefghijlmnoqstuvxz";

    //public static String revHash(long hash) {
      //  double a ;




      //  ArrayList<String> nstr = new ArrayList<String>();



    //}

    public static long hash(String s){
        long h = 7;
        for (int i = 0; i < s.length(); i++){
            h = h * 23 + letters.indexOf(s.charAt(i));
        }
        return h;
    }
}
