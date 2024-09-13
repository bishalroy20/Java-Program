
package Array_String;

import java.util.*;
public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(4,910);
        
//        num.remove(2);
        
//        num.removeAll(num);
//        num.clear();
//        boolean ch  = num.isEmpty();
//        System.out.println(ch);

        boolean pre = num.contains(910);
        int pos = num.indexOf(910);
        
        num.set(2,200);
        System.out.println(num);
        
        int a = num.get(3);
        System.out.println(a);
//        System.out.println(pre);
//        System.out.println(pos);
    }
}
