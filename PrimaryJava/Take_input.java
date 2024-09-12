//assignment 2,4
package com.mycompany.primaryjava;
import java.util.Scanner;

public class Product {
    public static void main(String args[]){
        int id;
        String price;
        Scanner i = new Scanner(System.in);
        
        id = i.nextInt();
        price = i.next();
        
        System.out.println("id : " + id);
        System.out.println("Price : " + price);
    }
}
