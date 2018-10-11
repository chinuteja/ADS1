class Book {
	String bookname;
	String author;
	double price;
	Book(String bookname, String author, double price) {
		this.bookname = bookname;
		this.author = author;
		this.price = price;
	}
	public String getBookname() {
		return this.bookname;
	}
	public String getAuthor() {
		return this.author;
	}
	public double getPrice() {
		return this.price;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int compareTo(Book that) {
		return this.bookname.compareTo(that.bookname);
	}
}