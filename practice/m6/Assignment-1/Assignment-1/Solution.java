import java.util.Scanner;
class AddLargeNumbers {

	public static LinkedList numberToDigits(String number) {
		LinkedList l = new LinkedList();
		String[] str = number.split("");
		for (int i = 0; i < str.length; i++) {
			l.Push(str[i]);
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
		while (!list1.isEmpty()) {
			String str1 = list1.pop();
			stack1.push(Integer.parseInt(str1));
		}
		while (!list2.isEmpty()) {
			String str2 = list2.pop();
			stack2.push(Integer.parseInt(str2));
		}
		String sum = "";
		int carry = 0;
		int s = 0;
		while (!stack1.isEmpty()) {
			s = s + stack1.pop() + stack2.pop() + carry;
			carry = s/10;
			
		}

    return  new LinkedList();
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
		Node newnode = new Node();
		newnode.data = item;
		newnode.next = head;
		head = newnode;

	}
	public boolean isEmpty() {
		return head == null;
	}
	public  String pop() {
		String data = head.data;
		head = head.next;
		return data;
	}


}
