
public class Duplicate {  
    public static void main(String[] args) {      
          
       
        int [] arr = new int [] { 2, 3, 4, 2, 7, 8, 16,3,16};   
          
        System.out.println("Duplicate elements in given array: ");  
        
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  