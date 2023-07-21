import java.io.*;
import java.util.*;
class minimum{
public static void main(String[] args)
{
int temp;
Scanner s = new Scanner(System.in);
int a[]=new int[9];
System.out.println("enter the array elements: ");
for(int i=0;i<9;i++)
{
a[i]=s.nextInt();
}
for( int i=0;i<9;i++)
{
for( int j=0;j<9;j++)
{
if(a[i]<a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("the minimum number in anm array is:"+a[0]);
}
}