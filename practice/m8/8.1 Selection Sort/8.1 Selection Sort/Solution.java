import java.util.*;
import java.util.Arrays;
class Selectionsort{
    public static void sort(Comparable[] a) {
    	for (int i=0; i<a.length;i++) {
    		int min = i;
    		for (int j=i+1;j<a.length;j++) {
    			if (less(a[j],a[min])) {
    				min = j;
    			}
    		}
    		exchange(a,i,min);

    	}
    } 
    private static boolean less(Comparable i,Comparable j) {
    	return i.compareTo(j)<0;
    }
    private static void exchange(Comparable a[], int i, int j) {
    	Comparable swap = a[i];
    	a[i] = a[j];
    	a[j] = swap; 
    }
}
class Solution {
	public static void main(String[] args) {
		//Selectionsort s = new Selectionsort();
		Scanner scan = new Scanner(System.in);
		String number_input = scan.nextLine();
		for(int i=0; i<Integer.parseInt(number_input);i++) {
		String str = scan.nextLine();
		String[] string = str.split(" ");	
		//System.out.println(string);
		Selectionsort.sort(string);
		System.out.println(Arrays.toString(string));}

	}
}