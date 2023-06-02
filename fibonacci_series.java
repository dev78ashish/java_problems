import java.util.Scanner;
public class fibonacci_series {
    public static void main(String[] args) {
        Scanner dev = new Scanner(System.in);
        System.out.println("Enter number of terms of Fibonacci series:");
        int n = dev.nextInt();

        int first=1, second=1;
        if(n==1)
            System.out.println(first);
        else if(n==2)
            System.out.println(first+" "+second);
        else{
            System.out.print(first+" "+second);
            for(int i=3; i<=n; i++){
                int temp = first+second;
                System.out.print(" "+temp);
                first = second;
                second = temp;
            }
        }
    }
}