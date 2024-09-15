
package oop;


public class WrapperClass {
    public static void main(String[] args) {
        
        //primitive -> object
        
        int a = 100;
        Integer x = Integer.valueOf(a); // autoboxing
        System.out.println("a : "+a);
        
        Integer y = a;  // internali  Integer.valueOf(a);  its call autoboxing
        System.out.println("y : "+y);

        
        //object -> primitive
        Double d = new Double (10.23);
        System.out.println("D : "+d);
        
        double d2 = d.doubleValue();
        System.out.println("after primitive : "+d2);

        //primitive  -> string
        int x = 120;
        String s = Integer.toString(x);
        String s = Double.toString(x);
        System.out.println("pri to string : "+s);
        
        //string  -> primitive
       String s = "32.2";
       int i = Integer.parseInt(s);
       double d = Double.parseDouble(s);
       System.out.println("String to primitive : " + d);
        
        //or
       int i = Integer.valueOf(s);
       System.out.println("string to primitive : "+i);
        
    }
}
