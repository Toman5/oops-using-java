
import java.util.*;

class Zpat
{
public static void main(String args[])
{
int i,j;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(i=1;i<=n;i++)
{
if(i==1||i==n)
{
for(j=1;j<=n;j++)
{
System.out.print(" @");
}
System.out.println(" ");
}
else
{
for(j=1;j<=n-i;j++)
{
System.out.print("  ");
}
System.out.print("##");
System.out.println(" ");
}
}
}
}