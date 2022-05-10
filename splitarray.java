import java.util.Arrays;
 
class splitarray
{
    // Method to split an array into two parts in Java
    public static void main(String[] args)
    {
        int[] inp = {58,24,13,15,63,9,8,81,1,78};
        int n = inp.length;
 
        int[] a = new int[(n + 1)/2];
        int[] b = new int[n - a.length];
 
        for (int i = 0; i < n; i++)
        {
            if (i < a.length) {
                a[i] = inp[i];
            }
            else {
                b[i - a.length] = inp[i];
            }
        }
 
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}