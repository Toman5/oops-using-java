import java.util.Scanner;

class count5 {
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int array[] =new int[n];
		for(int i=0;i<n;i++){
			array[i]=sc.nextInt();
		}
		int k = sc.nextInt();
		int count = 0;
		int i, j, mul;
		for (i = 0; i < n; i++) {
			if (array[i] < k)
				count++;
			mul = array[i];
			for (j = i + 1; j < n; j++) {
				mul = mul * array[j];
				if (mul < k)
					count++;
				else
				System.out.println("hai");	
			}
		}
		System.out.println(count);
		
	}
}