import java.util.Scanner;
public final class Solution {
	private Solution() {

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int operations = scan.nextInt();
		scan.nextLine();
		String[] tokens = scan.nextLine().split(" ");
		for (int i = 0; i < operations; i++) {
			LinearProbingHashST<String, Integer> hashst = new LinearProbingHashST<String, Integer>();
			switch (tokens[0]) {
			case "put":
				hashst.put(tokens[1], Integer.parseInt(tokens[2]));
				break;
			case "get":
			    System.out.println(hashst.get(tokens[1]));
			    break;
			case "delete":
			    hashst.delete(tokens[1]);
			    break;
			case "display":
                hashst.display();
                break;

			}
		}
	}
}