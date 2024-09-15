            //string buffer + builder //

package Array_String;

public class String2 {
    
    public static void main(String[] args) {
        String s = "Hi ";
        StringBuffer sb = new StringBuffer(s + "Bangladesh");
        sb.append(" is a country");
        System.out.println("String is : "+sb);
//        sb.reverse();
        sb.delete(2,5); //index
        sb.setLength(10);
        sb.toString();//sb -> s
    }
    
}
