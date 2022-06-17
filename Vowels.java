
public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Suryaprakash Rajkumar Dubey";
		int vowelcount = 0;
		int consCount = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.toLowerCase().charAt(i)=='a'||
					str.toLowerCase().charAt(i)=='e'||
					str.toLowerCase().charAt(i)=='i'||
					str.toLowerCase().charAt(i)=='o'||
					str.toLowerCase().charAt(i)=='u')
				vowelcount++;
			else if(str.charAt(i)==' ')
				continue;
			else
				consCount++;
				
		}
		System.out.println("Total number of vowels: "+vowelcount);
		System.out.println("Total number of consonants: "+consCount);
	}

}
