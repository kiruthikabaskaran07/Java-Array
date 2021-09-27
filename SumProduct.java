
public class SumProduct {  
    public static void main(String[] args) {  
       
        int [] arr = new int [] {11, 2, 3, 14, 5,16};  
        int product=1,sum = 0;  
        
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
		   product=product*arr[i];
        }  
        System.out.println("Sum of array: " + sum);  
 System.out.println("product of array: " + product);  
    }  
}  