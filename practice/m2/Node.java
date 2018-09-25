class Node {
	private int data;
	private Node link;
	Node(int data) {
		this.data = data;
		this.link = null;
	}
	public int getData() {
		return this.data;
	}
	public Node getLink() {
		return  this.link;
	}
	public void setData(int item) {
		this.data = item;
	}
	public void setLink(Node x) {
		this.link = x;
	}
}