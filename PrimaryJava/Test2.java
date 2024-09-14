                                        //method + constructor //

// package oop;

// public class Teacher {
//     String name,age;
//     int phn;
//     //constructor
//     Teacher(String s,String ag,int n){
//         name = s;
//         age = ag;
//         phn = n;
//     }
    
    
//     //method build
    
// //    void setvalue(String s,String ag,int n){
// //        name =s ;
// //        age = ag;
// //        phn = n;
// //    }
//     void display(){
//         System.out.println("Name : "+name);
//         System.out.println("Age : "+age);
//         System.out.println("Phn : "+phn);
//     }
// }

package oop;

public class Test {
    public static void main(String[] args) {
        
        
//        Using method ( we need setvalue method )

//        Teacher t1 = new Teacher();
//        Teacher t2 = new Teacher();
//        t1.setvalue("Bishal Roy", "21", 1309482127);
//        
//        t2.setvalue("Pushpita Sikder", "21", 1876376522);
        
//        using constructor (we need Teacher constructor)

        Teacher t1 = new Teacher("Bishal Roy", "21", 1309482127);
        Teacher t2 = new Teacher("Pushpita Sikder", "21", 1876376522);
        
        t1.display();
        System.out.println(" ");
        t2.display();
        
    }
}
