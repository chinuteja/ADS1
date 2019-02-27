
class LinkedList {
    private int size;
    private Node head;
    private Node tail;
    LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    class Node {
        private int data;
        Node next;
        Node(final int data) {
            this.data = data;
        }
    }
    
    
    public void addEnd( int data) {
        if (head == null) {
            // System.out.println("ifblol");
            Node newnode = new Node(data);
            head = newnode;
            size++;
        } else {
            // System.out.println("else");
            Node newnode = new Node(data);
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
            size++;
        }
    }
    public int removeEnd() {
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
            temp.next = null;
            size--;
            // System.out.println("size......"+size);
            // System.out.println(temp.data);
            return x;
        }
    }
    public String toString() {
        Node temp = head;
        String str = "";
        while (temp.next != null) {
            str += temp.data;
            temp = temp.next;
        }
        str += temp.data;
        return str;
    }
    public int getSize() {
        return this.size;
    }
    public void addStart(final int data) {
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
}