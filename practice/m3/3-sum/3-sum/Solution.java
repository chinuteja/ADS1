import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k, n, count = 0;
        n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++ ) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n - 2 ; i++) {
            int j = i + 1;
            int x = n - 1;
            while (j < x) {
                if (arr[i] + arr[j] + arr[x] == 0) {
                    count++;
                    j++;
                    x--;

                } else if (arr[i] + arr[j] + arr[x] < 0) {
                    j++;

                } else {
                    x--;
                }
            }

        }
        System.out.println(count);
    }
}