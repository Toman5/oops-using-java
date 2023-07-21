import java.io.*;
import java.util.*;
class Ducknumber{
public static void main(String[] args)
{
int i;
int sub=0;
Scanner s=new Scanner(System.in);
int a[]=new int[10];
System.out.println("enter the array elements: ");
for(i=0;i<=9;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<=9;i++)
{
int choice,option;
    while(1)
    {
        System.out.println("Move from 16 to 2 :");
        System.out.println("Move from 1 to 2 :");
        System.out.println("Move from 2 to 2 :");
       System.out.println("Move from 0 to 2 :");
      System.out.println("Move from 4 to 2 :");
	  System.out.println("Move from 2 to 2 :");
	  System.out.println("Move from 7 to 2 :");
	  System.out.println("Move from 1 to 2 :");
	  System.out.println("Move from 2 to 2 :");
	  System.out.println("Move from 14 to 2 :");
        System.out.println("enter the choice(1,2,3,4,5,6,7,8,9,10): ");
		System.out.println("enter the option");
     int n= nextInt();
        switch(option)
        {
            case 1:
                 sub=16-2;
				 System.out.println("Move from 16 to 2 :");
                 break;
            case 2:
                  sub=1-2;
				 System.out.println("Move from 1 to 2 : ");
                 break;
            case 3:
                  sub=2-2;
				 System.out.println("Move from 2 to 2 :");
                 break;
            case 4:
                 sub=0-2;
				System.out.println("Move from 0 to 2:");
                break;
            case 5:
                  sub=4-2;
				 System.out.println("Move from 4 to 2: ");
                 break;
				 case 6:
                  sub=2-2;
				 System.out.println("Move from 2 to 2  ");
                 break;
				 case 7:
                  sub=7-2;
				 System.out.println("Move from 7 to 2 : ");
                 break;
				 case 8:
                  sub=1-2;
				 System.out.println("Move from 1 to 2 : ");
                 break;
				 case 9:
                  sub=2-2;
				 System.out.println("Move from 2 to 2 : ");
                 break;
				 case 10:
                  sub=14-2;
				 System.out.println("Move from 14 to 2 :");
                 break;

        }
    }
}
}
}
