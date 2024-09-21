                  // static variable //


// package staticVariable;


// public class Studentvariable {
//     static int cnt = 0;
    
//     Studentvariable(){
//         cnt++;
//     }
    
//     void total(){
//         System.out.println("Total : "+cnt);
//     }
// }

package staticVariable;

/**
 *
 * @author Bishal Roy
 */
public class Test {
    public static void main(String[] args) {
        Studentvariable s1 = new Studentvariable();
        Studentvariable s2 = new Studentvariable();
        Studentvariable s3 = new Studentvariable();
        
        s3.total();
    }
}
