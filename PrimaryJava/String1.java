

//more built in function //
// charAt(index);
// codePointAt(3) 3index er value er ascii
// indexOf("ab");
// lastIndexOf("B");
// trim;first to last all space delete;
// replace(i,j); (old,new);
// split("a"); a paile notun string;


package Array_String;
//import java.util.*;

public class String1 {
    public static void main(String[] args) {
        String s1 = "Bishal Roy ";
        String s2 = "Pushpita Sikder";
        
//        System.out.println("Length : " + s1.length());
//        
//        if(s1.equals(s2)){
//            System.out.println("Equal");
//        }
//        else{
//            System.out.println("Not Equal");
//        }
//        
//        System.out.println("s2 contains 'Sikder' : "+s2.contains("Sikder"));
//        
//        System.out.println("String Empty : "+ s1.isEmpty());
        
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        System.out.println(s1);
        System.out.println(s2);
//        System.out.println("Contain Sikder : " s2.contains());
        
        s1 = s1.concat(s2);
        System.out.println("After concat : "+s1);
        
        
        System.out.println("start Pu s1 : "+s1.startsWith("Bishal"));
        System.out.println("end with oy s2 : "+s2.endsWith("Sikder"));
    }
}
