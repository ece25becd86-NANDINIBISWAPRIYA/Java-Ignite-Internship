
package JavaIgniteDay2;
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name");
		String name = sc.nextLine();
		System.out.println("Enter your Age");
		int age = sc.nextInt();
		System.out.println("Are you a student(true/false)");
		Boolean isStudent = sc.nextBoolean();
		System.out.println("Name :" +name);
		System.out.println("Age :" +age);
		System.out.println("Student Status :" +isStudent);
	}

}
