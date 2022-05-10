import java.util.*;

public class evensum
{
	public static void main(String[] args) 
	{
		int Size, i, EvenSum = 0;
		Scanner in = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = in.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = in.nextInt();
		}   

		for(i = 0; i < Size; i++)
		{
			if(a[i] % 2 == 0)
			{
				EvenSum = EvenSum + a[i]; 
			}
		}		
		System.out.println("\n The Sum of Even Numbers in this Array = " + EvenSum);
	}
}