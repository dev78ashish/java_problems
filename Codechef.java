/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t > 0) {
            int n = scanner.nextInt(); // length of the binary array
            int[] a = new int[n]; // input binary array

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int[] c = new int[n]; // output binary array

            for (int i = 0; i <a.length; i++) {
                if (i % 2 == 0) {
                    c[i] = a[i + 1];
                } else {
                    c[i] = a[i - 1];
                }
            }

            // Print the output binary array
            for (int i = 0; i < c.length; i++) {
                System.out.print(c[i] + " ");
            }
            System.out.println();

            t--;
        }
    }
}
