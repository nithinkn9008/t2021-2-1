
public class Problem1 {
	void calculator (double a, double b, String str) {
		if(str.equals("+")) {
			System.out.println(a+b);
		}
		else if(str.equals("-")) {
			System.out.println(a-b);
		}
		else if(str.equals("*")) {
			System.out.println(a*b);
		}
		else if(str.equals("/")) {
			System.out.println(a/b);
		}
		else {
			System.out.println("Invalid operator type");
		}
	}
}
