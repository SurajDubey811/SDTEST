import java.util.Scanner;

public class FibonacciRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the length of fibonacci series you want");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(fibonacci(num));

	}
	public static int fibonacci(int n) {
		if (n <= 1)
			return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
