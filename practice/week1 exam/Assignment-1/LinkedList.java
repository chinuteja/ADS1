import java.util.*;
public  class LinkedList {
	private static  Node head, tail;
	private static int size;
	LinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	static class Node {
		Node next;
		int data;
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public  void pushRight(int data) {
		if (head == null) {
			Node newnode = new Node(data);
			head = newnode;
			// tail = newnode;
			size++;
		} else {
			Node newnode1 = new Node(data);
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newnode1;
			size++;

		}
	}
	public int size() {
		return size;
	}
	public void pushLeft(int data) {
		if (head == null) {
			Node newnode = new Node(data);
			head = newnode;
			size++;
		} else {
			Node newnode = new Node(data);
			newnode.next = head;
			head = newnode;
			size++;
		}
	}
	public int pop() {
		Node temp = head;
		if (temp == null) {
			// System.out.println("Linked list is empty");
			return 0;
		} else if (size < 2) {
			// System.out.println("size elif" +size);
			int x = head.data;
			// System.out.println(head.data);
			head = null;
			size--;
			return x;

		} else {

			while (temp.next.next != null) {
				temp = temp.next;
			}
			// System.out.println("hell");
			int x = temp.next.data;
			// System.out.println();
			temp.next = null;
			size--;
			// System.out.println("size......"+size);
			// System.out.println(temp.data);
			return x;
		}
	}
	public String toString() {
		String str = "";
		Node temp = head;
		while (temp != null) {
			str += temp.data;
			temp = temp.next;
		}
		return str;
	}
}