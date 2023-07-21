import java.util.Scanner;
import java.util.Arrays;
class police
{
	public static void main(String args [])
	{
		int count,i,j;
		System.out.println("Enter number of array elements :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char arr[]=new char[n];
		System.out.println("Enter the Array elements :");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.next().charAt(0);
		}
		System.out.println("Enter the K value");
		int K=sc.nextInt();
		for(i=0;i<K;i++){
			count =1;
			
				if(arr[0]==arr[i])
				{
					count++;
				}
				else{
					break;
				}
			
			    
				if(count<=1){
					
						System.out.println(" " +count);				
					
			}
		}
	}
}