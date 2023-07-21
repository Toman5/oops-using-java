import java.io.*;
import java.util.*;
class singledigit{
public static void main(String[] args)
{
int i;
int sum=0;
int b=1;
int c=1;
int d=1;
Scanner s = new Scanner(System.in);
System.out.println("enter the array size: ");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("enter the array elements: ");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
	sum=sum+a[i];
}
	b=sum/10;
	c=sum%10;
	d=b+c;
	System.out.println(" sum is"+d);
	
	
}
}

	