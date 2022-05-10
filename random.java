
import java.util.*;
import java.io.*;
class random
{
    int c=0;
    public void input()throws IOException
    { Scanner in=new Scanner(System.in);
        
        System.out.println("enter a word");
        String st=in.next();
        display(" ",st);
        System.out.println("total "+c);
    }
    
    void display(String s1,String s2)
    {
        if(s2.length()<=1)
        {c++;
            System.out.println(s1+s2);
        }
        else
        {
            for(int i=0;i<s2.length();i++)
            {
                String x=s2.substring(i,i+1);
                String y=s2.substring(0,i);
                String z=s2.substring(i+1);
                display(s1+x,y+z);
            }
            }
        }
        public static void main(String args[])throws IOException
        {
            anagram ob=new anagram();
            ob.input();
        }
    }
        