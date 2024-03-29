import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class collage {
    // feilds
    private String name;
    int pincode;

    // methods
    public void display() {


        System.out.println("name is " + name);
        System.out.println("located in " + pincode);
    }

    public void setValues(String str, int num) {
        name = str;
        pincode = num;
    }

    public String getNames(){
       return name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        collage address = new collage();
        address.setValues("Sathyabama",600101);
        address.display();
        String num1 = address.getName();
        System.out.println(num1);

    }
}

class student{

    public static void main(String[] args) {
        collage user =new collage();
        user.setValues("Dakshan",635109);
        user.display();
        String dk= user.getName();
        System.out.println(dk);

    }
}

// inheritence
class animal{
    int legs=4;

    public void leg(){
        System.out.println("i can walk");
    }
    public void bark() {
        System.out.println("i can walk");
    }

    public void jump(){
            System.out.println("i can jump");
        }
    }
     class dog extends animal{

    String name = "tony";

     }
     class call {

         public static void main(String[] args) {
             dog obj= new dog();
             System.out.println("i have four "+obj.legs+" legs");
             System.out.println(obj.name);
             obj.leg();
             obj.bark();
             obj.jump();
         }
     }

// polymorphism
// method overloading
  class polymorphism{
    public static void main(String[] args) {
        function obj = new function();
        obj .method(1000000);
        obj.method(2,78);
        obj.method(23,45,67);
    }
}

class function {
    void method(int a) {
        System.out.println(a);


    }

    void method(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    void method(int a, int b, int c) {
        if (a > b && a > c){
            System.out.println("A is bigger");
        }
        else if (b>a && b>c) {
            System.out.println("B is bigger");
        }
        else{
            System.out.println("C is bigger");
        }

    }
}
// method overriding
class tenses {
    public static void main(String[] args) {
        generation1 obj = new generation1();
        obj.english();
        System.out.println(obj.tense);
        System.out.println(obj.tense1);

        generation2 obj2 = new generation2();
        System.out.println("  ");
        obj2.english();

    }
}
// super class
class generation {
     String tense  = "doing ";
     String tense1 = "sleeping";

     public void english(){
         System.out.println("Grammer");
     }

}
//parent class
class generation1 extends generation{
     String tense = "walking";
    }

//child class
class generation2 extends generation1{
    }

//    abstract classes

abstract class cse{
    String course;
    String course1 ;

    void print(){
        System.out.println("specialization");
        System.out.println(course);
        System.out.println(course1);
    }
}
class computer extends cse{

    }

class technology extends cse{

}
class Abstract {
    public static void main(String[] args) {
        computer c = new computer();
        c.course = "AI";
        c.course1 = "ML";


        c.print();
        System.out.println("  ");

        technology t = new technology();
        t.course1 = "DATA SCIENCE";
        t.course = "IOT";

        t.print();
    }
}
//scanner

class Inputs{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("My name  is  "+ str);

        int initial = input.nextInt();
        System.out.println("My age is "+ initial);

        char c = input.next().charAt(0);
        System.out.println("My blood grp is "+c+'+');

    }
}

// Exception
class exceptionhandling{
    public static void main(String[] args) {
        int a = 16;
        int b = 0;

        try {
            System.out.println(a / b);
        }
        catch (ArithmeticException E) {
            System.out.println("Cannot be Divded");
        }
        System.out.println("completed");
    }


}
//file writing

class writing{
    public static void main(String[] args) {
        try {
            File f = new File("Reader.dk");
            FileWriter written = new FileWriter(f);
            written .write("java learning " +
                            "java programming"+
                             "java skills");
            written.close();

        }
        catch (Exception E){
            System.out.println("Invalid");
        }

    }
}
//file reading
 class reading{
    public static void main(String[] args) {
        try{
        File R = new File("Reader.dk");
        Scanner reader = new Scanner(R);
        while(reader.hasNextLine()){
            System.out.println(reader.nextLine());
        }
    }
        catch (Exception E){
            System.out.println("Invalid");
        }
    }
}

class keys {
    public static void main(String[] args) {
        String s= Integer.toString(55);
        System.out.println(s);

        String x = Integer.toBinaryString(15);
        System.out.println(x);

        int y = Integer.valueOf(x);
        System.out.println(y);

        int z = Integer.parseInt(s
        );
        System.out.println(z);

    }
}
abstract class Not {
    abstract void TurnON();

    abstract void TurnOff();
    void display(){
        System.out.println("Printing");
    }
}



class Ok extends Not{
    @Override
    void TurnON() {
        System.out.println("Overridding");
    }

    @Override
    void TurnOff() {
        System.out.println("Overridding");
    }
}

class yes{
    public static void main(String[] args) {
        Ok N = new Ok();
        N.TurnOff();
        N.TurnON();
        N.display();
    }
}












