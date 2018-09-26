import java.util.*;
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the elements of an array");
		
		for (int i =0;i<n ;i++ ) {
			int k = scan.nextInt();
			arr[i] = k;
			System.out.println("the array elements"+ " "+arr[i]);
	
		}
		Arrays.sort(arr);
		for (int i = 0;i<arr.length ;i++ ) {
			System.out.println("sorted array "+arr[i]);
			
		}
		int check = 1;
		int count = 0;
		for (int i = 0;i<arr.length-1;i++ ) {
			//System.out.println("hello");
			if (arr[i] == arr[i+1]) {
				check = check+1;
				System.out.println("Check is " +check);
			}
			else {
				count = count + (check*(check-1))/2;
				System.out.println("count is "+count);
				check = 1;
			}
		}
		count = count + (check*(check-1))/2;
		System.out.println("count is " +count);
	}

}