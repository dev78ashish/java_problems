
import java.util.*;

class comparison
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int i=0;
        while(i<t){

            boolean matchFound = false;
            int[] arr1 = new int[2];
            int[] arr2 = new int[2];
            int[] arr3 = new int[2];



            arr1[0] = scanner.nextInt();
            arr1[1] = scanner.nextInt();


            arr2[0] = scanner.nextInt();
            arr2[1] = scanner.nextInt();

            arr3[0] = scanner.nextInt();
            arr3[1] = scanner.nextInt();

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            Arrays.sort(arr3);
            // Compare elements of first array with second array
            if (arr1[0] == arr2[0] && arr1[1] == arr2[1]) {
                System.out.println("1");
                matchFound = true;
            }

            // Compare elements of first array with third array
            if (arr1[0] == arr3[0] && arr1[1] == arr3[1]) {
                System.out.println("2");
                matchFound = true;
            }

            // If no match was found, print "Neither"
            if (!matchFound) {
                System.out.println("Neither");
            }


            i++;
        }
    }
}
