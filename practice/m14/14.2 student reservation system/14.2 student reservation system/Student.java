/**
 * Class for Student.
 */
class Student implements Comparable<Student> {
    /**
     * String name.
     */
    private String name;
    /**
     * String date.
     */
    private String date;
    /**
     * String month.
     */
    private String month;
    /**
     * String year.
     */
    private String year;
    /**
     * String subject1.
     */
    private int subject1;
    /**
     * String subject2.
     */
    private int subject2;
    /**
     * String subject3.
     */
    private int subject3;
    /**
     * String totalmarks.
     */
    private int totalmarks;
    /**
     * String reservation.
     */
    private String reservation;
    /**
     * boolean alloted.
     */
    private boolean alloted;
    /**
     * Constructs the object.
     *
     * @param      name1         The name
     * @param      date1         The date
     * @param      month1        The month
     * @param      year1         The year
     * @param      sub1          The subject 1
     * @param      sub2          The subject 2
     * @param      sub3          The subject 3
     * @param      totalmarks1   The totalmarks
     * @param      reservation1  The reservation
     */
    Student(final String name1, final String date1, final String month1,
        final String year1,
        final int sub1, final int sub2, final int sub3,
        final int totalmarks1, final String reservation1) {
        this.name = name1;
        this.date = date1;
        this.month = month1;
        this.year = year1;
        this.subject1 = sub1;
        this.subject2 = sub2;
        this.subject3 = sub3;
        this.totalmarks = totalmarks1;
        this.reservation = reservation1;
    }
    /**
     * Gets the alloted.
     *
     * @return     The alloted.
     */
    public boolean getAlloted() {
        return alloted;
    }
    /**
     * Sets the alloted.
     *
     * @param      alloted1  The alloted 1
     */
    public void setAlloted(final boolean alloted1) {
        this.alloted = alloted1;
    }
    /**
     * Gets name.
     *
     * @return     name.
     */
    public String getname() {
        return name;
    }
    /**
     * Sets name1.
     *
     * @param      name1  The name.
     */
    public void setname(final String name1) {
        this.name = name1;
    }
    /**
     * Get date.
     *
     * @return     date.
     */
    public String getdate() {
        return date;
    }
    /**
     * Set date1.
     *
     * @param      date1  The date.
     */
    public void setdate(final String date1) {
        this.date = date1;
    }
    /**
     * Get month.
     *
     * @return     { description_of_the_return_value }
     */
     public String getmonth() {
      return month;
     }
     /**
      * set month.
      *
      * @param      month1  The month 1
      */
     public void setmonth(final String month1) {
      this.month = month1;
     }
     /**
      * Get year.
      *
      * @return     { description_of_the_return_value }
      */
      public String getyear() {
       return year;
      }
      /**
       * Sets year1.
       *
       * @param      year1  The year 1
       */
      public void setyear(final String year1) {
       this.year = year1;
      }
    /**
     * Get subject1.
     *
     * @return     subject1.
     */
    public int getsubject1() {
        return subject1;
    }
    /**
     * Set sub1.
     *
     * @param      sub1  The subject1.
     */
    public void setsubject1(final int sub1) {
        this.subject1 = sub1;
    }
    /**
     * Get subject2.
     *
     * @return     subject2.
     */
    public int getsubject2() {
        return subject2;
    }
    /**
     * Set sub2.
     *
     * @param      sub2  The subject2.
     */
    public void setsubject2(final int sub2) {
        this.subject2 = sub2;
    }
    /**
     * Get subject3.
     *
     * @return     subject3.
     */
    public int getsubject3() {
        return subject3;
    }
    /**
     * Set sub3.
     *
     * @param      sub3  The subject2.
     */
    public void setsubject3(final int sub3) {
        this.subject3 = sub3;
    }
    /**
     * Get totalmarks.
     *
     * @return     totalmarks.
     */
    public int gettotalmarks() {
        return totalmarks;
    }
    /**
     * Set totalmarks1.
     *
     * @param      totalmarks1  The totalmarks.
     */
    public void settotalmarks(final int totalmarks1) {
        this.totalmarks = totalmarks1;
    }
    /**
     * Get resrvation.
     *
     * @return reservation.
     */
    public String getreservation() {
        return reservation;
    }
    /**
     * Set reservation1.
     *
     * @param      reservation1 The reservation.
     */
    public void setreservation(final String reservation1) {
        this.reservation = reservation1;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return this.name + "," + this.totalmarks + "," + this.reservation;
    }
    /**
     * compareTo function compares the inputs a and b.
     *
     * @param      that  The that
     *
     * @return     integer.
     */
    public int compareTo(final Student that) {
        Student a = this;
        if (a.totalmarks > that.totalmarks) {
            return 1;
        }
        if (a.totalmarks < that.totalmarks) {
            return -1;
        }
        if (a.subject3 > that.subject3) {
            return 1;
        }
        if (a.subject3 < that.subject3) {
            return -1;
        }
        if (a.subject2 > that.subject2) {
            return 1;
        }
        if (a.subject2 < that.subject2) {
            return -1;
        }
        if (Integer.parseInt(a.year) < Integer.parseInt(that.year)) {
            return -1;
        }
        if (Integer.parseInt(a.year) > Integer.parseInt(that.year)) {
            return 1;
        }
        if (Integer.parseInt(a.month) < Integer.parseInt(that.month)) {
            return -1;
        }
        if (Integer.parseInt(a.month) > Integer.parseInt(that.month)) {
            return 1;
        }
        if (Integer.parseInt(a.date) < Integer.parseInt(that.date)) {
            return -1;
        }
        if (Integer.parseInt(a.date) > Integer.parseInt(that.date)) {
            return 1;
        }
        return 0;
    }
}
