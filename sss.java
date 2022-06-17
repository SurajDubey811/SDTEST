import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class sss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Suryaprakash";
		List<String> l = Arrays.asList(str);
		
	    
		
		Set<String> st = l.stream().collect(Collectors.toSet());
		
		for(String s: st)
		{
			System.out.print(s);
		}
	}
	

}
