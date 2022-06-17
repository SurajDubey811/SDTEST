import java.util.Arrays;

@SuppressWarnings("unused")
public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,2,4,3,-5,0,-1};
		bubbleSort(a);
		//Arrays.sort(a);
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void bubbleSort(int[] a) {
		for(int i = 0;i<a.length;i++)
			for(int j = 0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					a[j+1] = a[j]+a[j+1];
					a[j] = a[j+1]-a[j];
					a[j+1]= a[j+1]-a[j];
				}
			}
	}

}
