import java.io.*;
import java.util.*;
class p2
{
public static void main(String args[])
{
int i,j;
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
int c=sc.nextInt();
int a[][]=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=sc.nextInt();
}
}
for(i=0;i<r;i++)
{

for(j=0;j<c;j++)
{
if(i==c-2&&j==r-2)
{
}
else
{
a[i][j]+=a[r-2][c-2];
}
}
}
 count=1;
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(count%2!=0)
{
System.out.print(a[i][j]+" ");
}
else
{
if(a[i][j]<10)
{
System.out.print("S ");
}
else
{
System.out.print("D ");
}
}
count++;
}
System.out.println(" ");
}
}
}