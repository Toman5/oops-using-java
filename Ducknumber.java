import java.io.*;
import java.util.*;
class Ducknumber{
public static void main(String[] args)
{
int i;
Scanner s=new Scanner(System.in);
int a[]=new int[5];
System.out.println("enter the array elements: ");
for(i=0;i<=3;i++)
{
a[i]=s.nextInt();
}
if(a[0]==0)
{
System.out.println("Given number is not a duck number");
}
else
{
System.out.println("Given number is duck number");
}
}
}