import java.util.Scanner;

public class deleteduplicate
{
	public static void main(String[] args)
    {
		int Size, i, j, k;
		int[] Del_Dup_arr = new int[50];
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("\nPlease Enter the Duplicate Array size  : ");
		Size = in.nextInt();
		
		System.out.format("\nEnter Duplicate Array %d elements : ", Size);
		for(i = 0; i < Size; i++) 
		{
			Del_Dup_arr[i] = in.nextInt();
		}
		
		for(i = 0; i < Size; i++) 
		{
			for(j = i + 1; j < Size; j++)
			{
				if(Del_Dup_arr[i] == Del_Dup_arr[j]) {
					for(k = j; k < Size; k++) 
                    {
						Del_Dup_arr[k] = Del_Dup_arr[k + 1];
					}
					Size--;
					j--;
				}
			}
		}
		System.out.print("\nThe Final Array after Deleting Duplicates  = " );
		for(i = 0; i < Size; i++) 
		{
			System.out.format("%d ", Del_Dup_arr[i]);
		}
	}
}