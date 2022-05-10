import java.util.Scanner;

public class swapdiagonal
{
		public static void main(String[] args) 
        {
		
		int i, j, rows, columns, temp;
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("\n Please Enter Interchangeable Matrix Rows and Columns :  ");
		rows = in.nextInt();
		columns = in.nextInt();
		
		int[][] arr = new int[rows][columns];
		
		System.out.println("\n Please Enter the Interchangeable Matrix Items :  ");
		for(i = 0; i < rows; i++) 
        {
			for(j = 0; j < columns; j++) 
            {
				arr[i][j] = in.nextInt();
			}		
		}
		
		if(rows == columns) {
			for(i = 0; i < rows ; i++)
			{
				temp = arr[i][i];
				arr[i][i] = arr[i][rows-i-1];
				arr[i][rows-i-1] = temp;
			}
			System.out.println("\n Matrix Items after Interchanging Diagonals are :");
			for(i = 0; i < rows ; i++)
			{
				for(j = 0; j < columns; j++)
				{
					System.out.format("%d \t", arr[i][j]);
				}
				System.out.print("\n");
			}
		}
		else 
		{
			System.out.println("\n Matrix you entered is not a Square Matrix");
		}
	}
}