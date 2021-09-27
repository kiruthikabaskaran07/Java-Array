import java.util.*;
public class ArrayOccurrence{  
    public static void main(String[] args) { 
		int i,n;
       
		Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        n = in.nextInt(); 
		int arr1[]=new int[n];
        System.out.println("Enter " + n + " elements: "); 
		for(i = 0; i < n; i++) {
            arr1 [i] = in.nextInt();
        }
        int [] arr2 = new int [arr1.length];  

        int checked = -1;  
        for( i = 0; i < arr1.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr1.length; j++){  
                if(arr1[i] == arr1[j]){  
                    count++;  
                    
                    arr2[j] = checked;  
                }  
            }  
            if(arr2[i] != checked)  
                arr2[i] = count;  
        }  
  
      
        System.out.println("---------------------------------------");  
         
        for( i = 0; i <  arr2.length; i++){  
            if(arr2[i] !=checked)  
                System.out.println(" element  " + arr1[i] + "  occurs " + arr2[i]+"  times");  
        }  
        System.out.println("----------------------------------------");  
    }
	}  