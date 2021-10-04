// Rearrange array in alternating positive and negative number
import java.util.Arrays; 
class AlternatePosition
{
   public static int partition(int[] A)
    {
        int j = 0;
        int condition = 0;    
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] < condition )
            {               
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                j++;
            }
        }
		return j;
    }
    public static void rearrange(int[] A)
    {
       int p = partition(A);
        for (int n = 0; (p < A.length && n < p); p++, n=n+2)
        {
            int temp = A[n];
            A[n] = A[p];
            A[p] = temp;
        }
    }
 
    public static void main(String[] args)
    {
        int[] A = { 7, -1, -2, -5, -9,8, 6, 3 };
        System.out.println("Before Rearrange: " + Arrays.toString(A));
        rearrange(A);
        System.out.println("After Rearrange: " + Arrays.toString(A));
    }
}


