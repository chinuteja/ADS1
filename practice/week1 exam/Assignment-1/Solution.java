import java.util.*;

 class AddLargeNumbers {
    public static LinkedList numberToDigits( String number) {
        LinkedList listObj = new LinkedList();
        String[] digits = number.split("");
        for (int i = 0; i < digits.length; i++) {
            listObj.addEnd(Integer.parseInt(digits[i]));
        }
        return listObj;

    }
    public static String digitsToNumber( LinkedList list) {
        return list.toString();
    }
    public static LinkedList addLargeNumbers(
         LinkedList list1,  LinkedList list2) {
        LinkedList listObj = new LinkedList();
        int size1 = list1.getSize();
        int size2 = list2.getSize();
        int size = 0;
        if (size1 < size2) {
            size = size2;
        } else {
            size = size1;
        }
        int carry = 0, value = 0;
        for (int i = size; i > 0; i--) {
            value = list1.removeEnd() + list2.removeEnd();
            value = value + carry;
            carry = value / 10;
            value = value % 10;
            listObj.addStart(value);
        }
        if (carry > 0) {
            listObj.addStart(carry);
        }
        return listObj;

    }
}
public  class Solution {
    public static void main( String[] args) {
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
            LinkedList result = AddLargeNumbers.addLargeNumbers(
                                    pDigits, qDigits);
            System.out.println(AddLargeNumbers.digitsToNumber(result));
            break;
        default:
            break;
        }
    }

}
