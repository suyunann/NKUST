public class Human {
    double weight; //data member
    double height; //data member
    int age; //data member
    String name; //data member

    Human(String humanName) {
        this(35);
        name = humanName;
        // no return value
//        this(35); //呼叫內部建構元必須在第一行
    }
    private Human(int humanAge) { //私有建構元
        age = humanAge;
    }
    Human(double humanWeight, double humanHeight) {
        weight = humanWeight;
        height = humanHeight;
    }


    int getAge() {
        //method member
        return this.age; //this 指向此類別本身
    }

    String getMyName() {
        return this.name; //this 指向此類別本身
    }

    void ShoutMyName() {
        //method member
        System.out.println("MY NAME IS " + getMyName().toUpperCase() + "!!!!!!!!!!!"); //於類別內呼叫getMyName函數
    }

    double calcBMI() {
        //method member
        double prefixHeight = this.height / 100;
        return this.weight / Math.pow(prefixHeight, 2);  //about Math.pow() https://www.educative.io/edpresso/how-to-use-the-mathpow-method-in-java
    }
}
