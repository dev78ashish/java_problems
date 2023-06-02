import java.util.Scanner;
public class natural_multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of test cases:");
        int t = sc.nextInt();
        for(int j=0; j<t; j++){
            System.out.println("Enter the value of n:");
            int n = sc.nextInt();
            int sum = 0;
            for(int i=0; i<n; i++){
                if(i%3==0 || i%5==0)
                    sum = sum + i;
            }
            System.out.println(sum);
        }


    }
}
