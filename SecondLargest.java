import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,3,2,4,4,5,5,5,8,8,2};
		boolean b = false;
		Arrays.sort(a);
		for(int i=a.length-2;i>=0;i--)
		{
			if(a[i]!=a[a.length-1]) {
				System.out.println(a[i]+" is the second largest");
				b = true ;
				break;
			}
				
			
		}
		if(!b)
			System.out.println(" there Is no second largest number");
		
	}

}
