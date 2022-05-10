import java.util.*;
public class reversefunction
 { 
      public static void main(String args[])
    {  System.out.print("Enter the string to be reversed: ");
       Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String s;
        StringBuffer sc=new StringBuffer(str);  
        sc.reverse();  
        s = sc.toString();  
        System.out.println("Result= "+s);
    }  
 }