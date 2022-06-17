import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the length of fibonacci series you want");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		fibo(num);
	}
	public static void fibo(int num) {
		
		int a = 0;
		int b = 1;
		int c = 1;
		for(int i=0;i<=num;i++) {
			System.out.print(a + ", ");
			a = b;
			b = c;
			c = a+b;
		}
	}

}
