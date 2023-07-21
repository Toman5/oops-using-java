import java.io.*;
import java.util.*;
class average{
public static void main(String[] args)
{
double a[]={1,2,3,4,5};
double i,sum=0,avg;
double n=a.length;
for(i=1;i<=n;i++)
{
sum=sum+i;
}
avg=sum/5;
System.out.printf("avg= "+avg);
}
}


