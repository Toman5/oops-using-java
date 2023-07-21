import java.util.*;

class Fifth
{
public static void main(String args[])
{
char c,k,d;
int i,j;
Scanner s=new Scanner(System.in);
System.out.println("string");
String let=s.nextLine();
int n=let.length();
System.out.println(n);
for(i=0;i<n;i++)
{
c=let.charAt(i);
d=let.charAt(n-1-i);

j=(int)c + (int)d -96;

k=(char)j;

System.out.print(k);

}

}

}