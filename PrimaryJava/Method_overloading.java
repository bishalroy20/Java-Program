
// package method_overload;
// public class Overload {
    
//     void add(int a,int b){
//         System.out.println("ans : "+(a+b));
//     }
//     void add(double a,double b){
//         System.out.println("ans : "+(a+b+1));
//     }
//     void add(int a,int b,int c){
//         System.out.println("ans : "+(a+b+c));
//     }
//     void add(){
//         System.out.println("No Parameter");
//     }
// }

package method_overload;

/**
 *
 * @author Bishal Roy
 */
public class Test {
    public static void main(String[] args) {
        Overload a = new Overload();
        a.add(2, 3);
        a.add();
        a.add(7.5, 22.3);
    }
}
