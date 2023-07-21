import java.io.*;
import java.util.*;
class identity{
public static void main(String[] args)
{
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter the column size:");
int n1=sc.nextInt();
System.out.println("enter the row size:");
int n2=sc.nextInt();
int r=sc.nextInt(n1);
int c=sc.nextInt(n2);
int a[][]=new int[r][c];
for(i=1;i<=r;i++)
{
for(j=1;j<=c;j++)
{
a[i][j]=sc.nextInt();
}
}
for(i=1;i<=r;i++)
{
for(j=1;j<=c;j++)
{
if(a[1][1]==a[2][2] && a[1][1]==a[3][3])
{
System.out.println("Yes, It is identity matrix");
break;
}
else
{
System.out.println("Yes, It is not identity matrix");
break;
}
}
}
}
}