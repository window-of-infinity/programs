import java.util.*;
class ring

{
    
    public static void main(String args[])
    {
    Scanner in=new Scanner(System.in);
    System.out.println("enter the number of fingers to wear the ring");
    double n=in.nextDouble();
    System.out.println("enter the number of rings to wear");
    double r=in.nextDouble();
    double s=Math.pow(r,n);
    System.out.println("result for possible number of ways the rings can be worn = "+s);
}
}

    
    