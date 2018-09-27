import java.util.Scanner;
class LinkedList {
	private class Node {
		char data;
		Node nextaddress;
	}
	Node head = null;
	public void push(final char item) {
		Node temp = new Node();
		temp.data = item;
		temp.nextaddress = head;
		head = temp; 
	} 
	public char pop() {
        char data = head.data;
        head = head.nextaddress;// to move pointer to next node.
        return  data;
	} 
	public boolean isEmpty() {
        return  head == null;
	}
	public char top() {
		return head.data;
	}
 
}
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = Integer.parseInt(scan.nextLine());
		for (int i=0;i<k ;i++) {
			String s = scan.next();
			if(Paranthesis(s)) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}
	public static boolean Paranthesis(String s) {
		LinkedList l = new LinkedList();
		int length = s.length();
		for (int i = 0;i<length ;i++ ) {
			char ch = s.charAt(i);
			if (ch == '{' || ch == '(' || ch == '[') {
				l.push(ch);
			} else{
				if(l.isEmpty()){
					return false;
				}
				if(ch == '}' && l.top() == '{') {
					l.pop();
				}
			
			else if (ch == ']' && l.top() == '[') {
				l.pop();
			}
			else if (ch == ')' && l.top() == '(') {
				l.pop();
			} else {
				return false;
			}

		}}
		return l.isEmpty();
	}
}