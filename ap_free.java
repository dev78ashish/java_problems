import java.util.Scanner;

public class ap_free {
    public static boolean isAPFreeSequence(int[] sequence) {
        int n = sequence.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if ((sequence[j] - sequence[i]) == (sequence[k] - sequence[j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();

        // Process each test case
        for (int testCase = 0; testCase < t; testCase++) {
            // Read the size of the sequence
            int n = scanner.nextInt();

            // Read the sequence
            int[] sequence = new int[n];
            for (int i = 0; i < n; i++) {
                sequence[i] = scanner.nextInt();
            }

            // Check if the sequence is AP-Free
            if (isAPFreeSequence(sequence)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}