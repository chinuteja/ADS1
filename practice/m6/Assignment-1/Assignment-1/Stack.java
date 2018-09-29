public class Stack {
	int size = 0;
    Node head = null;
    class Node {
    	int data;
    	Node next;
    }
    public void push(int item) {
    	Node newnode = new Node();
    	newnode.data = item;
    	newnode.next = head;
    	head = newnode;

    }
    public boolean isEmpty() {
    	return  head == null;
    }
    public int pop() {
    	int data = head.data;
    	head = head.next;
    	return  data;
    }
}