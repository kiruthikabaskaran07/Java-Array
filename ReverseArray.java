import java.util.*;
public class ReverseArray {  
    public static void main(String[] args) { 
		int i,n;
       
		Scanner in = new Scanner(System.in);
   
        System.out.print("Enter number of elements: ");
        n = in.nextInt(); 
		int arr[]=new int[n];
        System.out.println("Enter " + n + " elements: "); 
		for(i = 0; i < n; i++) {
            arr [i] = in.nextInt();
        }
   
        
        System.out.println("Original array: "+Arrays.toString(arr));  
        System.out.print("Array in reverse order: ");  
          
        for ( i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }  
    }  
} 