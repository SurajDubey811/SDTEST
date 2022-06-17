import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileContsainsString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\91704\\Desktop\\test.txt");
		Scanner sc = new Scanner(System.in);
		Scanner filetext = new Scanner(f);
		System.out.println("enter the string u want to search");
		String str = sc.nextLine();
		boolean b = false;
		while(filetext.hasNextLine()) {
			String line = filetext.nextLine();
			if(line.contains(str))
			{
				System.out.println("the string is present in the file");
				b = true;
				break;
			}
		}
		if(!b)
			System.out.println("String is not present in the file");
		sc.close();
		filetext.close();
	}

}
