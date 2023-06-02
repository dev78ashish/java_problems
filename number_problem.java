import java.util.Scanner;

public class number_problem {
    public static void main(String[] args) {
        Scanner dev = new Scanner(System.in);

        int t = dev.nextInt();
        for(int i=0; i<t; i++){
            int a = dev.nextInt();
            if(a%2==0 && a%7==0)
                System.out.println("Alice");
            else if(a%2!=0 && a%9==0)
                System.out.println("Bob");
            else
                System.out.println("Charlie");
        }

    }
}
