import java.util.*;
class Solution1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size");
		int m = scan.nextInt();
		System.out.println("enetr size");
		int n = scan.nextInt();
		int[] arr1 = new int[m];
		int[] arr2 = new int[n];
		int z = m+n;
		int i,j;
		int[] arr3 = new int[z];
		int x,y;
		for (i=0;i<m;i++ ) {
			arr1[i] = scan.nextInt();
			//System.out.println("arr1.." +arr1[i]);
			arr3[i] = arr1[i];
			System.out.println("arr3.." +arr3[i]);

		}
		for(int p=0;p<m;p++) {
			System.out.println("array3**"+arr3[p]);
		}
		for (j =0; j<n ;j++ ) {
			arr2[j] = scan.nextInt();
			arr3[i] = arr2[j];
			System.out.println("arr3 elements" +arr3[i]);
			i++;
		}
		for(int p=0;p<z;p++) {
			System.out.println("array3..."+arr3[p]);
		}
		Arrays.sort(arr3);
		for (int k =0;k<z ;k++ ) {
			System.out.println("array elements .." +arr3[k]);
		}
		
	}
}