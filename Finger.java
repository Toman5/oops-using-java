import java.util.*;
import java.io.*;
class finger{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int ans=num%8;
if(ans==1)
{
System.out.println("Thumb");
}
else if(ans==2||ans==0)
{
System.out.println("Index");
}
else if(ans==3||ans==1)
{
System.out.println("Middle");
}
else if(ans==4)
{
System.out.println("Ring");
}
else
{
System.out.println("Little");
}
}
}