import java.io.*;
public class Armstrong {

    public static void main(String[] args)
	    {

        int number = 371, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
           
            originalNumber /= 10;
        }

        if(result == number)
		{
            System.out.println( " is an Armstrong number");
		}
        else
		{
			System.out.println(" is not an Armstrong number");
		}
	}
}