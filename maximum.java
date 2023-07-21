import java.io.*;
import java.util.*;
class maximum{
	public static void main(String args[]){
		int i,j,max;
		Scanner sc = new Scanner(System.in);
		System.out.println("No. of elements of the array :");
		int n=sc.nextInt();
		System.out.println("Size of Subarray :");
		int k=sc.nextInt();
		int a[]=new int[n];
		System.out.println("The array elements are : ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<=n-k;i++)
		{
			max=a[i];
			for (j=1;j<k;j++) 
			{
				if (a[i+j]>max)
				{
					max=a[i+j];
				}
			
			}
			System.out.print(max + " ");
		}
	}
}