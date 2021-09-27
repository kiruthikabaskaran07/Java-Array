import java.util.*;
 
public class LargeFactorial {
    public static void main(String args[]) {
        int count, max, i;
        int[] inputArray = new int[500];
   
        Scanner in = new Scanner(System.in);
   
        System.out.print("Enter number of elements: ");
        count = in.nextInt();
        System.out.println("Enter " + count + " elements: ");
         
        for(i = 0; i < count; i++) {
            inputArray[i] = in.nextInt();
        }
   
        max = inputArray[0];
         
        for(i = 1; i < count; i++) {
            if(inputArray[i] > max)
                max = inputArray[i];

		}

 System.out.println("Largest Number : " + max);

 int x,fact=1;    
  for(x=1;x<=max;x++){    
      fact=fact*x;    
  }    
  System.out.println("Factorial of "+max+" is: "+fact);    
  
}
}

