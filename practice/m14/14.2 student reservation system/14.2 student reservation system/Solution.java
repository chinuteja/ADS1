/**.
 * import Scanner class
 */
import java.util.Scanner;
/**.
 * class for solution
 */
public final class Solution {
    /**.
     * Constructs the object.for soluiton class
     * @author Teja
     */
    private Solution() {
    }
    /**
     * Main function to take inputs.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentsQualified = sc.nextInt();
        int numOfvacancies = sc.nextInt();
        int unreserved_vacancies = sc.nextInt();
        int bc_vacancies = sc.nextInt();
        int sch_vacancies = sc.nextInt();
        int sct_vacancies = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        while (sc.hasNext()) {
            sb.append(sc.next() + "#");
        }
        String[] lines = sb.toString().split("#");
        int i = 0;
        Student[] students = new Student[lines.length];
        for (String line : lines) {
            String[] tokens = line.split(",");
            String[] date = tokens[1].split("-");
            Student student = new Student(tokens[0], date[0], date[1], date[2],
                Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]),
                Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]), 
                tokens[6]);
            students[i++] = student;
        }
        Heap.sort(students);
        // String output = "";
        // for (Student student : students) {
        //     System.out.println(student);
        // }
        print(students);
        allotment(students, numOfvacancies, unreserved_vacancies, bc_vacancies,
                  sch_vacancies, sct_vacancies);
    }
        public static void print(final Student[] students) {
            for (Student student : students) {
                System.out.println(student);
            }
            System.out.println();
        }
    /**
     * Alloting the seats to the students based on merit.
     * @param students  list of students.
     * @param numOfvacancies number of numOfvacancies.
     * @param unreserved_vacancies Un-reserved category.
     * @param bc_vacancies      Number of BC seats.
     * @param sch_vacancies      Number of SC seats.
     * @param sct_vacancies      Number of ST seats.
     */
    public static void allotment(final Student[] students,
                                 int numOfvacancies,
                                 int unreserved_vacancies,
                                 int bc_vacancies,
                                 int sch_vacancies,
                                 int sct_vacancies) {
        int i = 0;
        int k = 0;
        int N = students.length;
        Student[] alloted = new Student[numOfvacancies];
        for (i = 0; i < N; i++) {
            if (numOfvacancies == 0) {
                break;
            }

            if (unreserved_vacancies > 0) {
                unreserved_vacancies--;
                students[i].setAlloted(true);
                alloted[k] = students[i];
                numOfvacancies--;
                k++;
            }

            if (bc_vacancies > 0) {
                if (students[i].getreservation().equals("BC")
                        && students[i].getAlloted() != true) {
                    bc_vacancies--;
                    students[i].setAlloted(true);
                    alloted[k] = students[i];
                    numOfvacancies--;
                    k++;
                }
            }

            if (sch_vacancies > 0) {
                if (students[i].getreservation().equals("SC")
                        && students[i].getAlloted() != true) {
                    sch_vacancies--;
                    students[i].setAlloted(true);
                    alloted[k] = students[i];
                    numOfvacancies--;
                    k++;
                }
            }

            if (sch_vacancies > 0) {
                if (students[i].getreservation().equals("ST")
                        && students[i].getAlloted() != true) {
                    sct_vacancies--;
                    students[i].setAlloted(true);
                    alloted[k] = students[i];
                    numOfvacancies--;
                    k++;
                }
            }
        }

        for (i = 0; i < N; i++) {
            if (numOfvacancies > 0
                    && students[i].getreservation().equals("Open")
                    && students[i].getAlloted() == false) {
                students[i].setAlloted(true);
                alloted[k] = students[i];
                numOfvacancies--;
                k++;
            }
        }
        Heap.sort(alloted);
        print(alloted);
    }
}
