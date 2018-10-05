import java.util.Scanner;
class Linkedlist {
	class Node {
		Node next;
		int data;
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	int size = 0;
	Node start = null;
	public void insertAt(int index, int val) {
		start = insertAt(index, start, new Node(val), 0);
	}
	public Node insertAt(int index, Node first, Node elemnent, int count) {
		if (count == index) {
			elemnent.next = first;
			return elemnent;
		}
		first.next = insertAt(index, first.next, elemnent, count + 1);
		size++;
		return first;

	}
	public void reverse() throws Exception {
		if (start == null) {
			throw new Exception();
		}
		reverse(null, start);
	}
	public void reverse(Node previous, Node current) {
		if (current != null ) {
			reverse(current, current.next);
			current.next = previous;
		} else {
			start = previous;
		}
	}
	public String toString() {
		String str = "";
		Node temp = start;
		if (temp == null) {
			return "Empty linked list";
		}
		while (temp.next != null) {
			str = str + temp.data + ",";
			temp = temp.next;
		} str = str + temp.data + "";
		return str;
	}
}
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Linkedlist l = new Linkedlist();
		while (scan.hasNext()) {
			String[] str = scan.nextLine().split(" ");
			switch (str[0]) {
			case "insertAt":
				l.insertAt(Integer.parseInt(str[1]), Integer.parseInt(str[2]));
				System.out.println(l.toString());
				break;
			case "reverse":
				try {
					l.reverse();
					System.out.println(l.toString());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			}
		}
	}
}