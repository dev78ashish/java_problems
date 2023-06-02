import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner dev = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial:");
        int n = dev.nextInt();
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}