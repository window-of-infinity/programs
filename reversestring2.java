import java.util.*;
class reversestring2
 {
      
    public static void main(String[] args) 
    {  System.out.print("Enter the string to be reversed: ");
         Scanner in=new Scanner(System.in);
        String s =in.nextLine();    
        //Stores the reverse of given string    
        String reversedStr = "";    
            
        //Iterate through the string from last and add each character to variable reversedStr    
        for(int i = s.length()-1; i >= 0; i--)
        {    
            reversedStr = reversedStr + s.charAt(i);    
        }    
            
        System.out.println("Original string: " + s);    
        //Displays the reverse of given string    
        System.out.println("Reverse of given string: " + reversedStr);    
    }    
    
}
