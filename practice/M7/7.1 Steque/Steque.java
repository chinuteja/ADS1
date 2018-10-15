class Steque {
    Node head = null;
    class Node {
        Node next;
        String data;

        Node(String data1) {
            this.data = data1;
            this.next = null;
        }
    }
    public void push(String item) {
        Node newnode = new Node(item);
        newnode.next = head;
        head = newnode;
    }
    public void enqueue(String item) {
        if (head == null) {
            Node newnode = new Node(item);
            head.next = newnode;
            head = newnode;
        }
        else {
            Node newnode1 = new Node(item);
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode1;
        }
    }
    public void pop() {
        // if (head == null) {
        //     System.out.println("Steque is empty.");
        // }
        if (head != null) {
            head = head.next;
        }
    }
    public String toString() {
        String str = "";
        Node temp = head;
        if (temp == null) {
            return "Steque is empty.";
            
        }
        while(temp.next != null) {
            str += temp.data + "," + " ";
            temp = temp.next;
        }
        str += temp.data;
        return str; 
    }
}
