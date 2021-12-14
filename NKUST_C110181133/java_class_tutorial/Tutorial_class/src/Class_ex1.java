public class Class_ex1 {
    public static void main(String[] args) {
        Person Cindy = new Person();
        // set the value to data member
        Cindy.name = "Cindy";
        Cindy.age = 18;
        Cindy.height = 168.3;
        Cindy.weight = 48.6;
        // call the method member
        Cindy.ShoutMyName();
        System.out.println("I am " + Cindy.getAge() + " years old");
        System.out.println("Wow my BMI is " + Cindy.calcBMI());
        System.out.println("==================================");
        Person Henry = new Person();
        Henry.name = "Henry";
        Henry.age = 20;
        Henry.height = 155.3;
        Henry.weight = 80.6;
        Henry.ShoutMyName();
        System.out.println("I am " + Henry.getAge() + " years old");
        System.out.println("Wow my BMI is " + Henry.calcBMI());
        System.out.println("==================================");


    }
}
