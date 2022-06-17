import java.util.Arrays;

public class SameArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 4, 1, 5, 3 };
		int[] b = { 1, 3, 2, 5, 4 };
		boolean c = areEqual(a, b);
		if (c)
			System.out.println("The arrays have same elements");
		else
			System.out.println("The arrays are not equal");

	}

	public static boolean areEqual(int[] a, int[] b) {

		if (a.length != b.length)
			return false;
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i=0;i<a.length;i++)
			if (a[i] != b[i])
				return false;
		return true;
	}

}
