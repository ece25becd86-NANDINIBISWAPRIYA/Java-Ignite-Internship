package JavaIgniteDay4;
import java.util.Scanner;
public class Sum_Until_Negative_Num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int num;
		do
		{
			System.out.println("Enter the number:");
			num = sc.nextInt();
			if(num>=0)
			{
			sum+=num;
			}
		}while(num>=0);
			
		
		System.out.println("Sum is: "+sum);
		
		sc.close();
	}

}
