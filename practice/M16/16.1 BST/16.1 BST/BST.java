//import java.util.NosuchElementException;
public class BST <Key extends Comparable <Key>, Value> {
	private Node root;
	private class Node {
		private Book key;
		private String value;
		private Node left;
		private Node right;
		public  Node(Book key, String value) {
			this.key = key;
			this.value = value;

		}
	}
	public void put(Book key, String value) {
		root = put(root, key, value);
	}
	public Node put(Node x, Book key, String value ) {
		if (x == null) return new Node(key, value);
		int cmp = key.compareTo(x.key);
		if (cmp < 0) {
			x.left = put(x.left, key, value);
		} else if (cmp > 0) {
			x.right = put(x.right, key, value);
		} else {
			x.value = value;
		}

		return x;
	}
	public String get(Book key) {
		Node x = root;
		while (x != null) {
			int cmp = key.compareTo(x.key);
			if(cmp < 0)  x =x.left;
			else if(cmp>0)    x=x.right;
			else return x.value;

		}
		return null;
	}

}
