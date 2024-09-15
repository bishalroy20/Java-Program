                             // static keyword //
// package static_keyword;


// public class Student {
//     String name;
//     int id;
//     static String uniname = "SEC";
    
//     Student(String s,int i){
//         name = s;
//         id = i;
//     }
    
//     void display(){
//         System.out.println("Name : "+name);
//         System.out.println("Id : "+id);
//         System.out.println("University Name : "+uniname);
//     }
// }

package static_keyword;


public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Bishal Roy",2021331518);
        Student s2 = new Student("Pushpita Sikder",2021331512);
        s1.display();
        s2.display();
    }
}
