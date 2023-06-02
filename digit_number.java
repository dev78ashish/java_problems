import java.util.Scanner;

public class digit_number {
    public static void main(String[] args) {
        Scanner dev = new Scanner(System.in);
        int t  = dev.nextInt();
        for(int i=0; i<t; i++){
            int number = dev.nextInt();
            String numberString = String.valueOf(number); // Convert number to string

            int countZeros = 0;
            int countOnes = 0;

            // Iterate through each character of the string
            for (int j = 0; j < numberString.length(); j++) {
                char c = numberString.charAt(j);

                if (c == '0') {
                    countZeros++;
                } else if (c == '1') {
                    countOnes++;
                }
            }

            if(countOnes>countZeros){
                if(countZeros==1)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
            else{
                if(countOnes==1)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }

        }
    }
}
