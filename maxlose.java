import java.util.*;
class maxlose{
public static int maxLoss(int[] prices) {
int minPrice = 0;
    int maxLoss = 0;
Scanner sc = new Scanner(System.in);
 int price[]=new int[3];
 for(int i=0;i<9;i++)
{
a[i]=sc.nextInt();
}
    for (i=0;i<=3;i++)
	{
        if (price < minPrice) {
            minPrice = price;
        }
        int loss = price - minPrice;
        if (loss > maxLoss) {
            maxLoss = loss;
        }
    }
    return 0;
}
}
