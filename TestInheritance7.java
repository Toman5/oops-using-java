import java.io.*;
import java.util.*;
class triangle
{
void formula1()
{
	int T1,T2;
Scanner s=new Scanner(System.in);
int n =s.nextInt();
 T1= n+1;
 T2= n*T1;
 T3=T2/2;
System.out.printf("Triangle number:"+T3);
}
}
class pentagon extends triangle
{
void formula2()
{
	int p1,p2,p3;
Scanner s=new Scanner(System.in);
int n =s.nextInt();
P1=3*(n)-1;
p2=n*p1;
p3=p2/2;
System.out.printf("pentagon number : "+p3);
}
}
class hexagonal extends triangle
{
void formula3()
{
	int h1,h2;
Scanner s=new Scanner(System.in);
 n =s.nextInt();
 h1=2*(n)-1;
 h2=n*h1;
System.out.printf("hexagonal number:",h2);
}
}
class TestInheritance4
{
public static void main(String args[])
{
	int p1,p2,p3;
if (p1==p2 && p1==p3)
{
System.out.println(p1);
}
}
}