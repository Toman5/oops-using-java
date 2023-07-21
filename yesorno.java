import java.io.*;
import java.util.*;
class yesorno 
{
public static void main(String args[])
{
	int i;
Scanner s=new Scanner(System.in);
System.out.println("enter the array1 size: ");
int n1=s.nextInt();
System.out.println("enter the array2 size: ");
int n2=s.nextInt();
int a1[]=new int[n1];
System.out.println("enter the array1 elements: ");
for(i=0;i<n1;i++)
{
a1[i]=s.nextInt();
}
int a2[]=new int[n2];
System.out.println("enter the array2 elements: ");
for(i=0;i<n2;i++)
{
a2[i]=s.nextInt();
}
if(Arrays.equals(a1,a2))
{
	System.out.println("yes");
}
else
{
	System.out.println("no");
}
}
}
