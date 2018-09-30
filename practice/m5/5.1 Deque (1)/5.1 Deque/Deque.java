import java.util.Scanner;
class Deque{
     int size = 0;
     private class Node {
     	private int data;
     	private Node next;
     }
     private Node head = null;

     public void pushLeft(int data) {
          Node newnode = new Node();
     	newnode.data = data;
     	newnode.next = head;
     	head = newnode;
          size++;
     }
     public void pushRight(int data) {
          if (head == null) {
               Node newnode = new Node();
               newnode.data = data;
               head = newnode;
          } else {
               Node newnode = new Node();
               Node temp = head;
               while (temp != null) {
                    temp = temp.next;
               }
               temp.next = newnode;
          }
     	size++;
     }
     public void popLeft() {
          if (head != null) {
               head = head.next;
          }
          size--;
     }
     public void popRight() {
          Node temp = head;
          if (head == null) {
               System.out.println("Node is empty");
          }
          else if (size < 2) {
               head = null;
          } else {
               while (temp.next.next != null) {
                    head = head.next;
               }
               head.next = temp;
          }
          size--;
     }
     public boolean isempty() {
          return head == null;
     }
     public int size() {
          return size;
     }
     public String display() {
          if(size !=0) {
          String str = "[";
          Node temp = head;
          while (temp != null) {
               str = temp.data + ",";
               temp = temp.next;
          }
          str = str + "]";
          return str;
     }
      return "[]";
     }
    
}