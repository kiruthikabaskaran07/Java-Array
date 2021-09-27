import java.util.Arrays;
class SortArray {
    public static void main(String[] args)
    {
        int  arr[] = { 25,9,11,14,5,7,16 };
		System.out.println("before sort:  "+Arrays.toString(arr));  
    

for (int i = 0; i < arr.length; i++)   
{  
for (int j = i + 1; j < arr.length; j++)   
{  
int tmp = 0;  
if (arr[i] > arr[j])   
{  
tmp = arr[i];  
arr[i] = arr[j];  
arr[j] = tmp;  
}  
}   
}
System.out.println("ascending order :  "+Arrays.toString(arr) );    
      
   
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                   int temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
System.out.println("descending order: "+Arrays.toString(arr));    
        
	}
}