import java.util.*;
class append
 {
      
    public static void main(String[] args) 
    {  System.out.print("Enter the string to be reversed: ");
         Scanner in=new Scanner(System.in);
        String s =in.nextLine();        
        String reversedStr = "", str;    
        for(int i = s.length()-1; i >= 0; i--)
        {    
            reversedStr = reversedStr + s.charAt(i);    
        }     
        str=s+reversedStr;
        System.out.println("Resultant String= "+str);
    }
}