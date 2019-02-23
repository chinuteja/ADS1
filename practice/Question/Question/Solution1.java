import java.util.*;

public class Solution1 {



	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int noofstudents = Integer.parseInt(scan.nextLine());
		TreeMap<Integer, Double> map = new TreeMap<>();
		// Student stud = new Student(noofstudents);
		for (int i = 0; i < noofstudents ; i++) {
			String line = scan.nextLine();
			String[] tokens = line.split(",");
			// stud.addObj(Integer.parseInt(tokens[0]), Double.parseDouble(tokens[1]));
			map.put(Integer.parseInt(tokens[0]), Double.parseDouble(tokens[1]));
		}
		int quires = Integer.parseInt(scan.nextLine());
		// Collection coll = map.values();
		ArrayList<Double> arr = new ArrayList<>();
		for (double value  : map.values() ) {
			arr.add(value);
			
		}
		for (int j = 0; j < quires ; j++) {
			int rollno = Integer.parseInt(scan.nextLine());
			double mark = map.get(rollno);
			int count = 0;
			for (int i = 0; i < arr.size() ; i++ ) {
				if (mark >= arr.get(i)) {
					count++;
					
				}

			}
			double total = (double) count/noofstudents;
			System.out.println("before rounding off" +total);
			total = total * 100;
			total = Math.round(total);
			System.out.println(total);




		}

	}
}