/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;  

/* Name of the class has to be "Main" only if the class is public. */
class practice
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s = new Scanner (System.in) ;
        int t = s.nextInt();
        while (t!=0) {
            int n = s.nextInt();
            int m=0;
            int arr [] = new int [n];
            for (int i=0; i<n ; i++) {
                arr[i] = s.nextInt();
            }
            for (int i=0; i<n ; i++) {
                if(arr[i] !=0) {
                    m++;
                }
            }
            System.out.println(m);
            t--;
        }
    }
}

