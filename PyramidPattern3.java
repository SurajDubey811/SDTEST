import java.util.Scanner;

public class PyramidPattern3 {

	private static void printPattern2(int rows) {
		// for loop for the rows
		for (int i = 1; i <= rows; i++) {
			// white spaces in the front of the numbers
			int numberOfWhiteSpaces = rows - i;

			//print leading white spaces
			printString(" ", numberOfWhiteSpaces);

			//print numbers
			for(int k=1;k<=i;k++)
				System.out.print(k+" ");

			//move to next line
			System.out.println("");
		}
	}

	//utility function to print string given times
	private static void printString(String s, int times) {
		for (int j = 0; j < times; j++) {
			System.out.print(s);
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the rows to print:");
		int rows = scanner.nextInt();
		// System.out.println("Rows = "+rows);
		scanner.close();

		System.out.println("Printing Pattern 2\n");
		printPattern2(rows);

	}

}