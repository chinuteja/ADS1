class LinkedList {
    private int size;
    private Node start;
    LinkedList() {
        size = 0;
        start = null;
    }
    public void pushRight(int data) {
        //Node newnode = new Node(data);
        if (start == null) {
            Node newnode = new Node(data);
            start = newnode;
            //System.out.println("hello .." + start);
        } else {
            Node a = new Node(data);
            Node temp = start;
           // temp = start.getLink();
            while (temp.getLink() != null) { // iterates through address
                temp = temp.getLink();
                //System.out.println("address.." + temp);
            }
            //temp1.setLink(a);
            temp.setLink(a);
            


        }
        size++;

    }
    public void pushLeft(int data) {
        Node newnode = new Node(data);
        newnode.setLink(start);
        start = newnode;
        size++;
        
    }
    public  void removeLeft() {
        //System.out.println("yipee");
        if (start != null) {
            start = start.getLink();
            //System.out.println("yipee");
        }
        size--;
    }
    public int size() {
        return size;
    }
    public void removeRight() {
        Node temp = start;
            
         if (start == null) {
            System.out.println("Node is Empty");;
        }else if(size < 2) {
           start = null;
        } else{
            while (temp.getLink().getLink() != null) {
                temp = temp.getLink();
                
            }
            temp.setLink(null);
        }
        size--;
    }
    public void remove(int item) {
        Node temp1 = start;
        while (temp1 != null) {
            if (temp1.getData() == item) {
                temp1.setLink(null);
            }
        }
        // if (temp1  == null) {
        //     System.out.println("Empty LinkedList");
        // }
        
    }
    public String toString() {
        String str = "";
        Node temp = start;
        if (temp == null) {
            return "Empty linked list";
        }
        while (temp != null) {
            str = str  + temp.getData() + ", "   ;
            //start.setLink(null);
            temp = temp.getLink();
            //System.out.println("hi..." + str);
        }
        //str = str + temp.getData();
        return str;
    }
}