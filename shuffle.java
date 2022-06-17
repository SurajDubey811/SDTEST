import java.util.Random;

public class shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7};
		for(int i:a)
		{
			int randomIndex = new Random().nextInt(a.length-1);
			int temp = a[randomIndex];
			a[randomIndex] = a[i];
			a[i] = temp;
		}
		for(int j:a)
			System.out.print(j+" ");
			
	}

}
