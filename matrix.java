import java.io.*;
import java.util.*;
class matrix
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int row=sc.nextInt();
	int column=sc.nextInt();
	int a[][]=new int[row][column];
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<column;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	System.out.print("Elements in Array are:\n");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<column;j++)
		{
		System.out.print("Row ["+i+"]: Column["+j+"] :" +a[i][j]);
		}
	}
}
}