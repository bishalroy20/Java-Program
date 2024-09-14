            // default and parametrized constuctor //

// package oop;

// public class Teacher {
//     String name,age;
//     int phn;
    
//     // default constructor
//       Teacher(){
//         System.out.println("Yes default");
//     }

//     //constructor
    
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

public class Test {
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher("Bishal Roy", "21", 1309482127);
       
       
        t1.display();
        System.out.println(" ");
         Teacher t2 = new Teacher();
        t2.display();
        
    }
}
