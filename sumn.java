import java.io.*;
import java.util.*;
public class sumn
{
public static void main(String[] args)
{
	int n=100;
	
	int sum=0;
	int i;
	for(i=1;i<n;i=i+2)
	{
		sum=sum+i;
		
	}
	System.out.printf("%d",sum);
}
}
