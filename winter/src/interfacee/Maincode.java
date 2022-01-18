package interfacee;


class Father implements Superhero{

    @Override
    public void superpower() {
        System.out.println("Invisiable");
    }
}



public class Maincode {
    public static void main(String[] args){
        Father myfather = new Father();
        myfather.superpower();




    }

}
