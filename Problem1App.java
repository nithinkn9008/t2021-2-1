import java.util.Scanner;

public class Problem1App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		System.out.println("Enter the operator");
		String str = scan.next();
		Problem1 pb = new Problem1();
		pb.calculator(a, b, str);
	}
}
	