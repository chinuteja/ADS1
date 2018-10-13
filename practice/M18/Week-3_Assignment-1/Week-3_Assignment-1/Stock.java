/**.
 * Class for stock.
 */
class Stock {
    /**.
     * { name of the company }
     */
    private String name;
    /**.
     * stock change of the company
     */
    Double change;
    /**
     * Constructs the object.
     *
     * @param      name    of String type
     * @param      change  of Double type
     */
    Stock(final String name1 , final Double change1) {
        this.name = name1;
        this.change = change1;
    }
    /**.
     * Gets the name.
     *
     * @return     The name.
     */
    public String getName() {
        return this.name;
    }
    /**.
     * Gets the change.
     *
     * @return     The change.
     */
    public Double getChange() {
        return this.change;
    }
    /**.
     * Sets the name.
     *
     * @param      name  The name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**.
     * Sets the change.
     *
     * @param      change  The change
     */
    public void setChange(Double change) {
        this.change = change;
    }
    /**.
     * { Compares names of two objects }
     *
     * @param      that  The that object of Stock
     *
     * @return     { returns 1 if this.name is greater than that.name else -1 }
     */
    public int compareTo(Stock that) {
        return this.name.compareTo(that.name);
    }
}
