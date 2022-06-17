import java.util.Scanner;

public class BinarySearch extends ArraySort{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,2,4,3,-5,0,-1};
		bubbleSort(a);
		System.out.println("Enter a value you want to search from array [-5 -1 0 2 3 4 10 ]");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int index = bsearch(a,0,a.length-1,num);
		if (index>=0)
			System.out.println(num+" is present at "+index+"th index");
		else
			System.out.println("the number is not present");
		sc.close();
	}
	public static int bsearch(int[] array,int low, int high, int key) {
		int mid = (low+high)/2;
		while(low<=high)
		{
			if(key>array[mid])
				low = mid+1;
			else if(key==array[mid])
				return mid;
			else
				high = mid -1;
			mid = (low+high)/2;
		}
		if(low>high)
			return -1;
		return -1;
	}
	
	

}
