import java.util.Random;
import java.util.Scanner;
public class guess_the_number {
    public static void main(String[] args) {
        Scanner dev = new Scanner(System.in);
        Random ran = new Random();
        int random = ran.nextInt(10);
        System.out.println("Enter a number:");
        int n=0;
        while(n!=random){
            n = dev.nextInt();
            if (n!=random)
                System.out.println("Try Again!");
            else
                System.out.println("You guessed it right!");
        }
    }
}
