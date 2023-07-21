import java.io.PrintStream;
import java.util.*;
public class Leapyear
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if(a%4==0)
{
System.out.println("leapyear");
}
else if(a%100==0)
{
System.out.println("leapyear");
}
else
{
System.out.println("not leapyear");
}
}
}