import java.util.*;
class reversestring
 {
      
    public static void main(String[] args) 
    {  System.out.print("Enter the string to be reversed: ");
         Scanner in=new Scanner(System.in);
        String s =in.nextLine();        
        String reversedStr = "";    
        for(int i = s.length()-1; i >= 0; i--)
        {    
            reversedStr = reversedStr + s.charAt(i);    
        }        
        System.out.println("Original string: " + s);    
        System.out.println("Reverse of given string: " + reversedStr);    
    }    
    
}
