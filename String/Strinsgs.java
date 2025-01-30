import java.util.*;

public class Strinsgs {
public static void printletter(String str){
    for (int i = 0; i < str.length(); i++) {
        System.out.print(str.charAt(i)+" ");
    }
}
    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c' };
        String str = "abcd";
        String str2 = new String("xyz");
        // strinsg in java is immutable
        Scanner sc = new Scanner(System.in);
        // String name;
        // // name = sc.next();
        // name = sc.nextLine();
        // System.out.println(name);
        // String fullanem = "tony stark";
        // System.out.println(fullanem.length());
        //concenation : str1 + str 2 
        String first = "harsh";
        String last = "jain";
        String Full = first +" "+last;
        // System.out.println(Full);
        // System.out.println(Full.charAt(2));
        printletter(str2);
    }
}