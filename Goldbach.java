import java.util.*;
public class Goldbach
{
    boolean isPrime(int n)
    {
        if(n<=1)        //All numbers that are less than or equal to one are  non-prime
            return false;

        int i;
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)  //If any number between 2 and n/2 divides n then n is non prime
                return false;
        }
        /*If any return statement is encountered it terminates the function immediately
         * therefore the control will come here only when the above return statements are not executed 
         * which can happen only when the number is a prime number.
         */
        return true;
    }
    
    void print(int n)
    {
        int i, j;
        for(i=2;i<=n;i++)
        {
            for(j=i;j<=n;j++)
            {
                //If i and j are both prime and i+j is equal to n then i and j will be printed
                if(isPrime(i)&&isPrime(j)&&i+j==n)
                System.out.println(i+", "+j);
            }
        }
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the limit: ");
        n = sc.nextInt();
        if(n%2==1)
        {       //Checking for invalid input and terminating the program
            System.out.println("INVALID INPUT. NUMBER IS ODD.");
            System.exit(0);
        }
        if(n<=9||n>=50)
        {       //Checking for 2nd invalid input and terminating the program
            System.out.println("INVALID INPUT. NUMBER OUT OF RANGE.");
            System.exit(0);
        }
        Goldbach ob = new Goldbach();       //Creating object
        System.out.println("Prime Pairs are: ");
        ob.print(n);
    }
}