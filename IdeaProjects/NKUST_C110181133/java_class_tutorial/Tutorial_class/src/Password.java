import java.util.Random;

public class Password {
    private int[] pwd = new int[4];

    Random ran = new Random();

    private void generatePwd() {
        for(int i=0; i<4; i++){
            pwd[i] = ran.nextInt(10);
        }
    }

    public void getPwd(){
        generatePwd();
        for(int i=0; i<4; i++){
            System.out.print(pwd[i]);
        }
    }
}
