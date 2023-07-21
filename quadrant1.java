import java.io.*;
import java.util.*;
public class AP
//public static void main(String args[])
{
	public class IdentifierExpectedExpression {
 Scanner s = new Scanner(System.in);
int a;
int b;
int c;
int d;
int e;
int area;
int perimeter;

System.out.print("enter a to calculate area and perimeter of circle",+a);
System.out.print("enter b to calculate area and perimeter of square",+b);
System.out.print("enter c to calculate area and perimeter of rectangle",+c);
System.out.print("enter d to calculate area and perimeter of trapezium",+d);
System.out.print("enter e to calculate area and perimeter of rhombus",+e);
choice = s.nextInt();
switch(choice){
 case 'a':
        System.out.println("enter the radius:");
           int r=s.nextInt() ;
         area=3.14*r*r;
        System.out.println("the area of circle is:");
          perimeter=2*3.14*r;
          System.out.println("the perimeter of circle is:");
break;
case 'b':
        System.out.println("enter the side:");
           int side=s.nextInt() ;
         area=side*side;
        System.out.println("the area of square is:");
          perimeter=4*side;
          System.out.println("the perimeter of square is:");
break;
case 'c':
        System.out.println("enter the height and width:");
           int height=s.nextInt();
            int width=s.nextInt();
         area=height*width;
        System.out.println("the area of rectangle is:");
          perimeter=(2*height)+(2*width);
          System.out.println("the perimeter of rectangle is:");
break;
case 'd':
        System.out.println("enter the diagonal1 and side:");
           int diagonal1=s.nextInt();
            int diagonal2=s.nextInt();
            int side=s.next ;
         area=0.5*diagonal1*diagonal2;
        System.out.println("the area of rhombus is:");
          perimeter=(2*height)+(2*width);
          System.out.println("the perimeter of rhombus is:");
break;
}
public static void main(String[] args) 
    {
        Perimeter obj = new Perimeter();
        obj.area();
        
    }
}}

