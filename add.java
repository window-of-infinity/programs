import java.util.Scanner;

public class add
{
   public static void main(String[] args)
   {
      int row, col, i, j;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter Row size: ");
      row = scan.nextInt();
      System.out.print("Enter column Size: ");
      col = scan.nextInt();
      
      int[][] arr = new int[row][col];
      
      System.out.print("\nEnter " +(row*col)+ " Elements: ");
      for(i=0; i<row; i++)
      {
         for(j=0; j<col; j++)
            arr[i][j] = scan.nextInt();
      }
      
      System.out.println("\nArray's Elements with its indexes: ");
      for(i=0; i<row; i++)
      {
         for(j=0; j<col; j++)
            System.out.print("arr["+i+"]["+j+"] = " +arr[i][j]+"\t");
         System.out.print("\n");
      }
   }
}