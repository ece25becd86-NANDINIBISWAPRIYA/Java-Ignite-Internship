package JavaIgniteDay2;
import java.util.Scanner;


public class typecasting {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Decimal number");
	double num = sc.nextDouble();
	int result = (int)num;
	System.out.println("Original : " +num);
	System.out.println("Aftercasting : " +result);

	}
}
