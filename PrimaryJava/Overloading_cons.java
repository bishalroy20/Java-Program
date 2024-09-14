                          //constructor overloading //

// package oop;

// public class Teacher {
//     String name,age;
//     int phn;
    
//     Teacher(){
//         System.out.println("No information");
//     }
    
//     Teacher(String s,String ag){
//         name = s;
//         age = ag;
//     }
    
//     Teacher(String s,String ag,int n){
//         name = s;
//         age = ag;
//         phn = n;
//     }
    
//     void display(){
//         System.out.println("Name : "+name);
//         System.out.println("Age : "+age);
//         System.out.println("Phn : "+phn);
//     }
    
// }
package oop;

public class Overloading_cons {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher("Pushpita Sikder","21");
        Teacher t3 = new Teacher("Bishal Roy","21",1309482127);
        
        
        System.out.println("");
        t2.display();
        System.out.println("");
        t3.display();
    }
}
