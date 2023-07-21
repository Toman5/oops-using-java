import java.io.PrintStream;
import java.util.*;
public class leapyear
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if(a/4==0)
{
System.out.println("leapyear");
}
elseif(a/100==0)
{
System.out.println("leapyear");
}
else
{
System.out.println("not leapyear");
}
}