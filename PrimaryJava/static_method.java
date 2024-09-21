                    // static method  //

// package staticMethod;

// /**
//  *
//  * @author Bishal Roy
//  */
// public class staticmethod {
    
//     void display1(){
//         System.out.println("I am non-static");
//     }
    
//     static void display2(){
//         System.out.println("I am static");
//     }
// }



package staticMethod;


public class Test {
    public static void main(String[] args) {
        staticmethod ob1 = new staticmethod();
        ob1.display1();
        
        //static method className.method name
        staticmethod.display2();
    }
    
}
