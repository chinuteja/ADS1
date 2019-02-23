import java.util.*;

public class Solution1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int noofstudents = Integer.parseInt(scan.nextLine());
		LinearProbingHashST<Integer, Double> binarysearchST = new LinearProbingHashST<Integer, Double>(noofstudents);
		for (int i = 0; i < noofstudents ; i++) {
			String line = scan.nextLine();
			String[] tokens = line.split(",");
			binarysearchST.put(Integer.parseInt(tokens[0]), Double.parseDouble(tokens[1]));
		}
		binarysearchST.show();
		int quires = Integer.parseInt(scan.nextLine());
		for (int j = 0; j < quires ; j++) {
			int rollno = Integer.parseInt(scan.nextLine());
			// double get = binarysearchST.get(rollno);
			// System.out.println(get);
			// System.out.println();
			// System.out.println("rank of key" +binarysearchST.rank(rollno));
			// int lesserstudents = 1 + binarysearchST.rank(rollno);
			// System.out.println("lesserstudents "+lesserstudents);
			// double total = 0;
			// total = (100*lesserstudents) / noofstudents;
			// System.out.println(total);
			int count = binarysearchST.lesser(rollno);
			double total = 0;
			double count1 = (double) count / noofstudents;
			count1 = Math.round(count1 * 100.0) / 100.0;
			// System.out.format("%.2f",total);
			System.out.println(count1 * 100);

		}
	}
}