import java.util.*;
class palinstring
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
        if(s.compareTo(reversedStr)==0)   
        {System.out.println("Palindrome");
    }  
        else  
        {System.out.println("not Palindrome");    
    }
    }
    
}
