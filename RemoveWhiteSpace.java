import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String[] a;
		a = str.split(" ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		
	}

}
