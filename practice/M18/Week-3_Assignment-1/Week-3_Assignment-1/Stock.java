/**
 * Class for stock.
 */
class Stock implements Comparable<Stock> {
	public String name;
	public Double change;
	public Stock(String name1, Double change1) {
		this.name = name1;
		this.change = change1;
	}
	public String getName() {
		return this.name;
	}
	public Double getchange() {
		return this.change;
	}

	public String toString() {
		return this.name + " " + this.change;
	}
	
	public int compareTo(Stock that) {
        if(this.change < that.change) {
        	return -1;
        }
        if( this.change > that.change) {
        	return 1;
        }
        return this.getName().compareTo(this.getName());
	}
}