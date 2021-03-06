/**
 * imports array package
 */
import java.util.Arrays;
/**
 * Class for heap sort.
 */
class HeapSort {
    /**
     * student array.
     */
    private Student[] students;
    /**
     * variable for size.
     */
    private int size;
    /**.
     * Constructs the object.
     */
    protected HeapSort() {
        final int fourty = 40;
        students = new Student[fourty];
        this.size = 0;
    }
    /**
     * function for add.
     *
     * @param      s     { parameter_description }
     */
    public void add(final Student s) {
        students[size++] = s;
    }
    /**
     * function for size.
     *
     * @return     { description_of_the_return_value }
     */
    public int size() {
        return size;
    }
    /**
     * time complexity of this method is O(N log N).
     * It access the array elements twice.
     */
    public void sort() {
        int n = size;
        for (int k = n / 2; k >= 1; k--) {
            sink(students, k, n);
        }
        while (n > 1) {
            swap(students, 1, n--);
            sink(students, 1, n);
        }
    }
    /**
     * Sink Function.
     * Moves deep into array.
     * @param      students1  The students
     * @param      k1         { integer  }.
     * @param      n         { integer  }.
     *
     * time complexity of this method is O(log N).
     * It access the array elements twice
     */
    public void sink(final Student[] students1, final int k1, final int n) {
        int k = k1;
        while (2 * k <= n) {
            int j = 2 * k;
            if (j < n && less(students1, j, j + 1))  {
                j++;
            }
            if (!less(students1, k, j)) {
                break;
            }
            swap(students1, k, j);
            k = j;
        }
    }
    /**
     * Less Function.
     *
     * @param      students1  The students
     * @param      i         { index value }
     * @param      j         { index value }
     *
     * @return     { returns true if condition is satisfied }
     *
     * // time complexity of this method is O(1).
     */
    public boolean less(final Student[] students1, final int i, final int j) {
        return students1[i - 1].compareTo(students1[j - 1]) >= 0;
    }
    // time complexity of this method is O(1). It swaps the elements only once.
    /**.
     * Swap function.
     *
     * @param      students1  The students
     * @param      j     { index of array }
     * @param      min   The minimum index of array
     */
    public void swap(final Student[] students1, final int j, final int min) {
        Student temp = students1[j - 1];
        students1[j - 1] = students1[min - 1];
        students1[min - 1] = temp;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        // System.out.println("in print");
        String str = "";
        for (int i = 0; i < size; i++) {
            str += students[i].getName() + "," + students[i].getTotal()
                   + "," + students[i].getCategory() + "\n";
        }
        return str;
    }
    /**
     * contains function.
     *
     * @param      arr   The arr
     * @param      s     { int parameter }.
     *
     * @return     { description_of_the_return_value }.
     * // time complexity of this method is O(N).
     */
    public boolean contains(final int[] arr, final int s) {
        for (int i : arr) {
            if (s == i) {
                return true;
            }
        }
        return false;
    }
    /**
     * function to find vacancy.
     *
     * @param      n     { number of vacacys }
     */
    // time complexity of this method is O(N). It iterates through the array size
    public void vacancy1(final int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].getName() + ","
                               + students[i].getTotal()
                               + "," + students[i].getCategory());
        }
    }

    /**
     * vacancy2 function.
     * Time complexity is O(N) as for loop iterates till size of array 
     * @param      a     { unreserved category }
     * @param      b     { bc }
     * @param      c     { sc }
     * @param      d     { st }
     */
    public void vacancy2(final int a, final int b, final int c, final int d) {
        int n = a;//unreserved category
        int n1 = b;// bc
        int n2 = c;//sc
        int n3 = d;//st
        int[] array = new int[n1 + n2 + n3];//bc + sc + st
        int i = 0;
        for (int k = n; k < size; k++) {
            if (students[k].getCategory().equals("BC") && n1 > 0) {
                array[i++] = k;
                n1--;
            } else if (students[k].getCategory().equals("SC") && n2 > 0) {
                array[i++] = k;
                n2--;
            } else if (students[k].getCategory().equals("ST") && n3 > 0) {
                array[i++] = k;
                n3--;
            }
        }
        if (n1 > 0) {
            for (int k = n; k < size; k++) {
                if (students[k].getCategory().equals("Open") && n1 > 0) {
                    if (!contains(array, k)) {
                        array[i++] = k;
                        n1--;
                    }
                }
            }
        }
        if (n2 > 0) {
            for (int k = n; k < size; k++) {
                if (students[k].getCategory().equals("Open") && n2 > 0) {
                    if (!contains(array, k)) {
                        array[i++] = k;
                        n2--;
                    }
                }
            }
        }
        if (n3 > 0) {
            for (int k = n; k < size; k++) {
                if (students[k].getCategory().equals("Open") && n3 > 0) {
                    if (!contains(array, k)) {
                        array[i++] = k;
                        n3--;
                    }
                }
            }
        }
        Arrays.sort(array);
        for (int k = 0; k < array.length; k++) {
            System.out.println(students[array[k]].print());
        }
    }
}
