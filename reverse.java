import java.io.printstream;
import java.util.*;
class reverse{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("enter the number");
int a=s.nextInt();
int r;
int j=0;
System.out.println("the reverse is");
while(a!=0)
{
	r=a%10;
	a=a/10;
	j=j*10+j;
	if(r%2==0)
	{
		System.out.println("even");
	}
	else
	{
		System.out.println("odd");
	}
}
System.out.printf("%d");
}
}
