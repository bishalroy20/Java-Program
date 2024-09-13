
package Array_String;
import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(100);
        num.add(18);
        num.add(1,34);
        num.add(234);
        num.add(-108);
        System.out.println(num);
        System.out.println("assending order");
        Collections.sort(num);
        System.out.println(num);
         
        Collections.sort(num.reversed());
        System.out.println(num);
             
//        num.remove(2);
//        System.out.println("Size : " + num.size());
//        System.out.println(num);

        // using iterator
        
//        Iterator it = num.iterator();
//        while(it.hasNext()){
//            System.out.print(" " + it.next());
//        }

//      using for each loop
//        for(int i : num ){
//            System.out.print(i + " ");
//        }
//    num.removeAll(num);
    }
}
