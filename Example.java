import java.io.*;
public class Example {
   public static void main (String[] args) {
      int a[][] = { {7, 9, 2}, {3, 8, 6}, {1, 4, 2} };
      int b[][] = { {7, 9, 2}, {1, 4, 2} };
      int n = 3;
	  int flag=0;
      for (int i = 0; i < n; i++)
         for (int j = 0; j < n; j++)
            if (a[i][j] != b[i][j])
			{
               flag = 0;
			}
            if (flag == 1)
			{
               System.out.print("Both the matrices are not identical");
			}
            else
			{
               System.out.print("Both the matrices are identical");
			}

   }
}