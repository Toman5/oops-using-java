import java.io.*;
import java.util.*;
class large
{
public static void main(String[] args)
{
int a[]={1,2,3,5};
int i;
int max=0;
int min=1;
int n=a.length;
for(i=1;i<=n;i++)
{
if(min>i)
{
min=i;
}
else if(max<i)
{
max=i-1;
}
}
System.out.println("min="+min);
System.out.println("max="+max);
}
}

