import java.util.Scanner;

public class Easy_Pronunciation {
    // function to check if a string is easy to pronounce
    public static String isEasyToPronounce(String s) {
        // array of vowels
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        // initialize current sequence length to zero
        int currentLength = 0;
        // iterate through the characters of the string
        for (char c : s.toCharArray()) {
            // if character is a consonant, increment current length
            if (!isVowel(c)) {
                currentLength++;
                // if current length is 4 or greater, return "NO"
                if (currentLength >= 4) {
                    return "NO";
                }
            }
            // if character is a vowel, reset current length to zero
            else {
                currentLength = 0;
            }
        }
        // if we reach the end of the string without encountering a sequence of 4 or more consonants, return "YES"
        return "YES";
    }

    // function to check if a character is a vowel
    public static boolean isVowel(char c) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char vowel : vowels) {
            if (c == vowel) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // read number of test cases
        int t = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        // iterate through the test cases
        for (int i = 0; i < t; i++) {
            // read input
            int n = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
            String s = scanner.nextLine();
            // check if string is easy to pronounce
            String result = isEasyToPronounce(s);
            // print result
            System.out.println(result);
        }
    }
}

