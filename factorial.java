import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int f = factorial1(num);
		System.out.println("factorial of the number "+num+" is " + f);

	}
	public static int factorial1(int n) {
		if(n==1)
			return n;
		else
			return n*factorial1(n-1);
		
	}

}
