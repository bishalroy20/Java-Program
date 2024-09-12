
package com.mycompany.primaryjava;
import java.util.Scanner;
public class Temperature {

    public static void main(String[] args) {
//        System.out.println("Hello World!")
        //c = (f-32)*5/9;
        Scanner c = new Scanner(System.in);
        double num;
        num = c.nextDouble();
        double d = ((num-32)*5)/9;
        System.out.println("in celcius : " + d);

    }
}
