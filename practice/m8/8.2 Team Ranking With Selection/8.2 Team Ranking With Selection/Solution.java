import java.util.Scanner;
import java.util.Arrays;
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int i = 0;
		while (scan.hasNext()) {
			sb.append(scan.nextLine() + ":");
		}
		String[] str = sb.toString().split(":");
		Team[] teams = new Team[str.length]; 
        for (String line : str ) {
        	String[] tokens = line.split(",");
        	teams[i++] = new Team(tokens[0],Integer.parseInt(tokens[1]),
        		Integer.parseInt(tokens[2]),Integer.parseInt(tokens[3]));
        }
        Selectionsort.sort(teams);

        String output = Arrays.toString(teams);
        output = output.replace("[","").replace("]","").replace(", ", ",");
        System.out.println(output);

        // for (Team team : (teams)
        // 	System.out.print(team.toString() +",");
        
	}
}