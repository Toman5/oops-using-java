import java.io.*;
import java.util.*;
public class equation
{
public static void main(String[] args)
{
int q1,q2,q3;
Scanner s = new Scanner(System.in);
int a ;
System.out.printf("enter the number");
a = s.nextInt();
int b;
System.out.printf("enter the number");
b = s.nextInt();
int n;
System.out.printf("enter the number");
n=s.nextInt();
{
q1=((a+2)^(0*b));
q2=(((a+2)^(0*b))+2^(1*b));
q3=((a+2)^(0+b)+2^(1*b)+2^((n-1)*b));

System.out.printf(" "," "," ",q1,q2,q3);
}
}
}