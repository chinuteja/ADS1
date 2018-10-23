/**.
 * Class for steque.
 */
class Steque {
    /**.
     * Node head
     */
    private Node head = null;
    /**.
     * Class for node.
     */
    class Node {
        /**.
         * next of node type
         */
        private Node next;
        /**.
         * data of String type
         */
        private String data;
        /**.
         * Constructs the object for Node
         *
         * @param      data1  String
         */
        Node(final String data1) {
            this.data = data1;
            this.next = null;
        }
    }
    /**.
     * pushes the given item to the left of Steque
     * TIme complexity is constant as each statement is exuceted only once.
     * @param      item  String type
     */
    public void push(final String item) {
        Node newnode = new Node(item);
        newnode.next = head;
        head = newnode;
    }
    /**.
     * pushes the item to the right of steque
     * Time complexity is N as the while loop iterates till end
     * @param      item  String
     */
    public void enqueue(final String item) {
        if (head == null) {
            Node newnode = new Node(item);
            head = newnode;
        } else {
            Node newnode1 = new Node(item);
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode1;
        }
    }
    /**.
     *Time complexity is constant as each statement is executed only once.
     * { pops the top most item in the steque }
     */
    public void pop() {
        // if (head == null) {
        //     System.out.println("Steque is empty.");
        // }
        if (head != null) {
            head = head.next;
        }
    }
    /**.
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String str = "";
        Node temp = head;
        if (temp == null) {
            return "Steque is empty.";
        }
        while (temp.next != null) {
            str += temp.data + "," + " ";
            temp = temp.next;
        }
        str += temp.data;
        return str;
    }
}
