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
    private Double change;
    /**
     * Constructs the object.
     *
     * @param      name1    of String type
     * @param      change1  of Double type
     */
    Stock(final String name1, final Double change1) {
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
     * @param      item  The item of string
     */
    public void setName(final String item) {
        this.name = item;
    }
    /**.
     * Sets the change.
     *
     * @param      val  The val of double type
     */
    public void setChange(final Double val) {
        this.change = val;
    }
    /**.
     * { Compares names of two objects }
     *
     * @param      that  The that object of Stock
     *
     * @return     { returns 1 if this.name is greater than that.name else -1 }
     */
    public int compareTo(final Stock that) {
        return this.name.compareTo(that.name);
    }
}
