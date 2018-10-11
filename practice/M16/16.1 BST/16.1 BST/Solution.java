import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        BST bst = new BST();
		while (scan.hasNext()) {
			String[] tokens = scan.nextLine().split(",");
			switch (tokens[0]) {
				case "put":
				   Book book = new Book(tokens[1] , tokens[2] ,Double.parseDouble(tokens[3]));
				   bst.put(book,tokens[4]);
				   break;
					
				case "get":
				   book = new Book(tokens[1], tokens[2], Double.parseDouble(tokens[3]));
				   System.out.println(bst.get(book));
				   break;
			}
			
		}
		
	}
}