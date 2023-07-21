import java.io.*;
class count1{
public static void main(String[] args)
{
int a[]={1,-1,2,-2,3,-3,-4};
int i;
int count=0;
int count1=0;
for(i=0;i<=6;i++)
{
if(i<0)
{
count=count+i;
}
else if(i>0)
{
count1=count1+i;
}
}
if(count>count1)
{
System.out.printf("false");
}
else
{
System.out.printf("true");
}
}
}