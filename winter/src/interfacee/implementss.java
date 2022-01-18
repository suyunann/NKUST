package interfacee;

interface suit {
    String suit = "super suit";

    public void first();

}

interface superpower{
    String power = "strong";
    public void second();
}

class  impclass implements suit,superpower{
    @Override
    public void first() {
        System.out.println("father"+ suit);
    }

    @Override
    public void second() {
        System.out.println("power"+power);

    }
}

 class implementss {
     public static void main(String[] args){

    impclass object = new impclass();
    object.first();
    object.second();

     }
}
