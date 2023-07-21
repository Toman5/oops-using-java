import java.io.*;
import java.util.*;
public class AP{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char a;
char b;
char c;
char d;
char e;
char area;
char perimeter;

System.out.prcharln("enter a to calculate area and perimeter of circle",+a);
System.out.prcharln("enter b to calculate area and perimeter of square",+b);
System.out.prcharln("enter c to calculate area and perimeter of rectangle",+c);
System.out.prcharln("enter d to calculate area and perimeter of trapezium",+d);
System.out.prcharln("enter e to calculate area and perimeter of rhombus",+e);
char choice = s.next float();
switch(choice){
 case 'a':
        System.out.prcharln("enter the radius:");
           char r=s.next float() ;
         area=3.14*r*r;
        System.out.prcharln("the area of circle is:");
          perimeter=2*3.14*r;
          System.out.prcharln("the perimeter of circle is:");
break;
case 'b':
        System.out.prcharln("enter the side:");
           char side=s.next float() ;
         area=side*side;
        System.out.prcharln("the area of square is:");
          perimeter=4*side;
          System.out.prcharln("the perimeter of square is:");
break;
case 'c':
        System.out.prcharln("enter the height and width:");
           char height=s.next float()  ;
            char width=s.next float();
         area=height*width;
        System.out.prcharln("the area of rectangle is:");
          perimeter=(2*height)+(2*width);
          System.out.prcharln("the perimeter of rectangle is:");
break;
case 'd':
        System.out.prcharln("enter the diagonal1 and side:");
           char diagonal1=s.next float() ;
            char diagonal2=s.next float() ;
            char side=s.next ;
         area=0.5*diagonal1*diagonal2;
        System.out.prcharln("the area of rhombus is:");
          perimeter=(2*height)+(2*width);
          System.out.prcharln("the perimeter of rhombus is:");
break;
}
}

}