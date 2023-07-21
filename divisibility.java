import java.io.*;
import java.util.*;
class divisibility
{
public static void main(String[] args)
{
 int i;
 int a=0;
 System.out.println(" ");
 Scanner s = new Scanner(System.in);
 int n=s.nextInt();
 for(i=0;i<=n;i++)
 {
     System.out.println(" ");
     a=s.nextInt();

 }
 if(a%10==0)
 {
     System.out.println("Yes");
 }
 else
 {
     System.out.println("No");
 }
}
}