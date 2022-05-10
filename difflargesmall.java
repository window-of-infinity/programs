import java.util.Arrays;
import java.util.Scanner;

public class difflargesmall
 {

  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter no. of array elements :");
    int n = in.nextInt();
    int a[] = new int[n];
    System.out.println("Enter the elements :");
    for (int i = 0; i < n; i++) 
    {
      a[i] = in.nextInt();
    }
    int n1 = display(a);
    System.out.println("Difference in largest and smallest element="+n1);
  }

  public static int display(int[] array)

  {
    Arrays.sort(array);
    int n = array[array.length - 1] - array[0];
    int b = array.length;
    if (b == 1) {
      n = array[0];
    }
    return n;
  }
}