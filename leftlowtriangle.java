import java.io.*;
class leftlowtriangle
{
public static void main(String[] args)
{
	int a[][]={{1,2,3},{4,5,6},{7,8,9}};
	
	int i;
	int j;
	i=a.length;
	j=a.length;
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
	
       if(j>i)
	   {
		      System.out.printf(" 0");
	   }
			   else
			   {
		   
			         System.out.println(a[j][i]+" ");
			   }
}
	}
	System.out.printf(" ");
}
}