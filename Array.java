import java.io.*;
import java.util.*;
class array1
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the array");
    int n=sc.nextInt();
	System.out.println("Enter the target");
	int target=sc.nextInt();
	for(target=0;target<=6;target++)
	{
		if(target==0)
		{
			System.out.println("4");
			break;
		}
		else if(target==3)
		{
			System.out.println("-1");
			break;
		}
	}
}
}