import java.io.*;
import java.util.*;
class Dissariumnumber
{
public static void main(String[] args)
{
int count=0;
int sum=0;
Scanner s = new Scanner(System.in);
System.out.println("enter the element: ");
int n=s.nextInt();
while(n!=0)
{
count++;
n=n/10;
}
while(n!=0)
{
int x= n%10;
sum = sum+(int)Math.pow(x,count);
count--;
n=n/10;
}
if(n==sum)
{
System.out.println(" The number is dissarium");
}
else
{
System.out.println(" The number is not dissarium");
}
}
}

