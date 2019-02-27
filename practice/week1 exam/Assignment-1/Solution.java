import java.util.Scanner;
class AddLargeNumbers {

    public static LinkedList numberToDigits(String number) {
        // System.out.println("string i s" + number);
        LinkedList l = new LinkedList();
        String[] tokens = number.split("");
        for (int i  = 0; i < tokens.length ; i++ ) {
            // System.out.println(tokens[i]);
            int x = Integer.parseInt(tokens[i]);
            l.pushRight(x);

        }

        return l;

    }

    public static String digitsToNumber(LinkedList list) {
        return list.toString();

    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
        LinkedList linkedListobj = new LinkedList();
        int size1 = list1.size();
        int size2 = list2.size();
        int size = 0;
        if (size1 < size2) {
            size = size2;
        } else {
            size = size1;
        }
        int carry = 0, value = 0;
        for (int i = size; i > 0 ; i++) {
            value = list1.pop() + list2.pop();
            value = value + carry;
            carry = value / 10;
            value = value % 10;
            linkedListobj.pushLeft(value);

        }
        return linkedListobj;


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
            System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
            // System.out.println("hello");
            LinkedList qDigits = AddLargeNumbers.numberToDigits(q);

            System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
            break;

            case "addLargeNumbers":
                LinkedList pDigit = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigit = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigit, qDigit);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }

}
