import java.io.*;
import java.util.*;
 class multiplicationtable
{
public static void main(String[] args)
{
Scanner s= new Scanner(System.in);
System.out.println("enter the number:");
int n=s.nextInt();
for(int i=1;i<=10;i++)
{
	System.out.printf("\n n*i=%d \n",+n*i);
}
}
}
