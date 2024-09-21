                        //static block //

      // jodi main method and static block thake tahole static block age kaj korbe erpor main method //
package staticMethod;

/**
 *
 * @author Bishal Roy
 */
public class staticBlock {
    static int id;
    static String name;
    
    static{
        id = 101;
        name = "Bishal";
    }
    
   static void display(){
        System.out.println("Name : "+name);
        System.out.println("id : "+id);
    
   }
   public static void main(String[] args) {
        staticBlock.display();
    }
}
