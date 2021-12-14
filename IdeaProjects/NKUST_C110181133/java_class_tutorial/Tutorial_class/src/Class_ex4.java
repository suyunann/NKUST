public class Class_ex4 {
    public static void main(String[] args) {
        Human Henry = new Human("Henry");
        // set the value to data member
        Henry.age = 18;
        Henry.height = 168.3;
        Henry.weight = 48.6;
        // call the method member
        Henry.ShoutMyName();
        System.out.println("I am " + Henry.getAge() + " years old");
        System.out.println("Wow my BMI is " + Henry.calcBMI());
        System.out.println("==================================");
        Human Frank = new Human(70.0, 176);
        // set the value to data member
        Frank.age = 18;
        Frank.name = "Frank";
        // call the method member
        Frank.ShoutMyName();
        System.out.println("I am " + Frank.getAge() + " years old");
        System.out.println("Wow my BMI is " + Frank.calcBMI());
        System.out.println("==================================");



    }
}
