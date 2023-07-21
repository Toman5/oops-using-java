import java.io.*;
class pattern2{
	public static void main(String[] args)
	{
int i;
int j;
int a[][];
for(i=1;i<=7;i++)
{
	for(j=1;j<=16;j++)
	{
		if(i==1 && j==1 && j==13)
		{
			System.out.println("1");
			System.out.println("13");
		}
		else if(i==2 && j==2)
		{
			System.out.println(" 2");
		}
		else if(i==3 && j==3)
		{
			System.out.println("  3");
		}
		else if(i==4 && j==4)
		{
			System.out.println("   4");
		}
		else if(i==5 && j==5)
		{
			System.out.println("     5");
		}
		else if(i==6 && j==6)
		{
			System.out.println("      6");
		}
		else if(i==7 && j==7)
		{
			System.out.println("       7");
		}
	}
	}
}
	}
