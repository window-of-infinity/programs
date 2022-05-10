import java.util.*;

class fseries
{ int fiboseries(int num)
    {
        if(num==1)
            return(0);
        else if(num==2)
            return(1);
        else if(num>2)
            return(fiboseries(num-1)+fiboseries(num-2));
        else
            return(-1);
    }

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number of term to display");
        int n,p=0;
        n=in.nextInt();
        fseries ob=new fseries();
        System.out.println("the series:");
        for(int i=1;i<=n;i++)
        {
            p=ob.fiboseries(i);
            System.out.println(p);
        }
    }
    }
    


