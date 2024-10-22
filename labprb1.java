package labprb1;
 import java.util.Scanner;
public class labprb1 {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num = input.nextInt();
		
		if(num%2==0 && num%3==0) {
			System.out.println("FALSE");
		}
		else if(num%2==0 || num%3==0) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
	}
}
