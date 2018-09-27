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

	} 
	public char isEmpty() {

	}

}