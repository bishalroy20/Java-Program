                            // method + object create //

// package oop;

// public class Teacher {
//     String name,age;
//     int phn;
    
//     //method build
//     void display(){
//         System.out.println("Name : "+name);
//         System.out.println("Age : "+age);
//         System.out.println("Phn : "+phn);
//     }
// }


package oop;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        
        t1.name = "Bishal Roy";
        t1.age = "21";
        t1.phn = 1309482127;
        
        t2.name = "Pushpita Sikder";
        t2.age = "21";
        t2.phn = 1876376522;
        
        t1.display();
        t2.display();
        
    }
}
