//program to print the duplicate of the given array
import java.util.*;
public class DuplicateArray {  
    public static void main(String[] args) {      
          
        //Initialize array   
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
       System.out.print("Given array: ");
       System.out.println("Given array:  "+Arrays.toString(arr));
       for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i]+"  "); 
        }       
        System.out.println("\nDuplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  