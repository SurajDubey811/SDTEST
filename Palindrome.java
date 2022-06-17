import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean flag = true;
		for(int i=0;i<=str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				flag = false;
				System.out.println(str+" is not a palindrome");
				break;
			}
		}
		if(flag) {
			System.out.println(str+" is a palindrome");
		}
	}

}
