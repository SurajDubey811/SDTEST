import java.util.Scanner;

public class PyramidPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the rows to print:");
		int rows = scanner.nextInt();
		for(int i=1;i<=rows;i++)
		{
			printString(" ",rows-i);
			printString(i+" ",i);
			System.out.println("");
		}
	}
	public static void printString(String item, int times) {
		for(int j=1;j<=times;j++)
			System.out.print(item);
		
	}

}
