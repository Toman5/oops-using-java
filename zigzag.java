import java.util.Arrays;
import java.util.Scanner;
class zigzag{
	public static void main(String args[])
	{
		int i,j,max;
		Scanner sc = new Scanner(System.in);
		System.out.println("No. of elements of the array :");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("The array elements are : ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("sorted array");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (i = 1; i <= n - 2; i += 2) {
			int temp = a[i];
			a[i] = a[i + 1];
			a[i + 1] = temp;
			
		}
		System.out.println("The zigzag element");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}