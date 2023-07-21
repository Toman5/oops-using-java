import java.io.*;
import java.util.*;
class median{
public static void main(String[] args)
{
int i,A;
double A1;
double A2;
Scanner s=new Scanner(System.in);
System.out.println("enter the array size: ");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("enter the array1 elements: ");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
if(n==5)
{
System.out.println("Median= "+a[2]);
break;
}
else if(n==4)
{
A=(a[1]+a[2]);

A1=A/2;
A2=0.5+A1;
System.out.println("Median= "+A2);
break;
}
}
}
}