
public class PrimeNumber {
    public static void main(String[] args) {
        int i, a;

        for (i = 2; i <= 100; i++) {
            for (a = 2; a < i; a++) {
                if (i % a == 0) {
                    break;
                }
            }
            if (a >= i) {
                System.out.println(a);
            }

        }

    }
}