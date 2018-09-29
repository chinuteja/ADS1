import java.util.Scanner;
class AddLargeNumbers {

	public static LinkedList numberToDigits(String number) {
		LinkedList l = new LinkedList();
		String[] str = number.split("");
		for (int i = 0; i < str.length; i++) {
			l.Push(str[i]);
			//System.out.println("number to digits " +l.Push(str[i]));
		}
		return l;

	}

	public static String digitsToNumber(LinkedList list) {
		String str = "";
		while (!list.isEmpty()) {
			str = list.pop();
		}
		return  str;


	}

	public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
		Stack stack1 = new Stack();
		Stack stack2 = new Stack();
		// if (list2.size > list1.size) {
		// 	int difference 
		// }
		//System.out.println("hello world");
		while (!list1.isEmpty()) {
			String str1 = list1.pop();
			stack1.push(Integer.parseInt(str1));
			//System.out.println("pushed itme "+stack1);
		}
		while (!list2.isEmpty()) {
			String str2 = list2.pop();
			stack2.push(Integer.parseInt(str2));
		}
		String sum = "";
		//int carry = 0;
		int s = 0;
		while (!stack1.isEmpty()) {
			s = s + stack1.pop() + stack2.pop() ;
			//System.out.println("sum " +s);
			//carry = s/10;
			
		}

    return  new LinkedList();
	}
	public LinkedList AddLargeNumbers(LinkedList l1 , LinkedList l2) {
		LinkedList l3 = new LinkedList();
		while(!l1.isEmpty()) {
			String s = l1.pop();
			l3.Push(s);
		}
		LinkedList l4 = new LinkedList();
		while (!l2.isEmpty()) {
			String str = l2.pop();
			l4.Push(str);
		}
        return  l3;
	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String p = sc.nextLine();
		String q = sc.nextLine();
		switch (input) {
		case "numberToDigits":
			LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
			LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
			System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
			System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
			break;

		case "addLargeNumbers":
			pDigits = AddLargeNumbers.numberToDigits(p);
			qDigits = AddLargeNumbers.numberToDigits(q);
			LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
			System.out.println(AddLargeNumbers.digitsToNumber(result));
			break;
		}
	}

}
class LinkedList {
	public class Node {
		private String data;
		private Node next;
	}
	private  Node head = null;
	public void Push(String item) {
		
    	if(head == null) {
    		Node newnode = new Node();
    		newnode.data = item;
    		newnode.next = null;
    		head = newnode;
    		//System.out.println("Push" +item);
    	} else {
    		Node temp = new Node();
    		temp.data = item;
    		Node temp1 = head;
    		while (temp1.next != null) {
    			temp1 = temp1.next;
    		}
    		temp1.next = temp;
    		temp.next = null;
    		//System.out.println("Push...."+item);
    	

	}}
	public boolean isEmpty() {
		return head == null;
	}
	public  String pop() {
		String data = head.data;
		head = head.next;
		//System.out.println("linked list pop" +data);
		return data;
	}


}
class Stack {
	int size = 0;
    Node head = null;
    class Node {
    	int data;
    	Node next;
    }
    public void push(int item) {
    	if(head == null) {
            Node newnode = new Node();
            newnode.data = item;
            newnode.next = null;
            head = newnode;
            //System.out.println("Push Stack" +item);
        } else {
            Node temp = new Node();
            temp.data = item;
            Node temp1 = head;
            while (temp1.next != null) {
                temp1 = temp1.next;
            }
            temp1.next = temp;
            temp.next = null;
            //System.out.println("Pushstack...."+item);
        

    }

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