import java.util.Arrays;
class Common3Array
{
	
	void Common3Array(int ar1[], int ar2[], int ar3[])
	{
		
		int i = 0, j = 0, k = 0;

		
		while (i < ar1.length && j < ar2.length && k < ar3.length)
		{
			
			if (ar1[i] == ar2[j] && ar2[j] == ar3[k])
			{ System.out.print(ar1[i]+" "); i++; j++; k++; }
			
			else if (ar1[i] < ar2[j])
				i++;
			
			else if (ar2[j] < ar3[k])
				j++;
			
			else
				k++;
		}
	}

	
	public static void main(String args[])
	{
		Common3Array ob = new Common3Array();

		int ar1[] = {10,16, 25, 40, 80,100};
		int ar2[] = { 7, 16,25, 80, 100};
		int ar3[] = {3, 16,  20,25, 70, 100, 120};

		System.out.print("Common elements are:  ");
		ob.Common3Array(ar1, ar2, ar3);
	}
}


