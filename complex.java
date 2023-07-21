import java.io.*;
import java.util.*;
class sum
{
void add()
{
	int sum1=0;
	int sum2=0;
Scanner s=new Scanner(System.in);
int a1 =s.nextInt();
int a2=s.nextInt();
int b1 = s.nextInt();
int b2 = s.nextInt();
sum1 = a1+b1;
sum2 = a2+b2;

System.out.printf("addition= %d + %di\n",sum1,sum2);
}
}
class difference extends sum
{
void sub()
{
	int diff1=0;
	int diff2=0;
Scanner s=new Scanner(System.in);
int a1 =s.nextInt();
int a2=s.nextInt();
int b1 = s.nextInt();
int b2 = s.nextInt();
diff1 = a1-b1;
diff2 = a2-b2;

System.out.printf("difference= %d+%di\n",diff1,diff2);
}
}
class multiplication extends sum
{
void mul()
{
	int mul1=0;
	int mul2=0;
Scanner s=new Scanner(System.in);
int a1 =s.nextInt();
int a2=s.nextInt();
int b1 = s.nextInt();
int b2 = s.nextInt();
mul1 = a1*b1;
mul2 = a2*b2;

System.out.printf("multiplication= %d+%di\n",mul1,mul2);
}
}
class TestInheritance4
{
public static void main(String args[])
{

sum a = new sum();
difference b = new difference();
multiplication d = new multiplication();
a.add();
b.sub();
d.mul();
}
}