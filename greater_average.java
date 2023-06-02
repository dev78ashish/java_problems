import java.util.Scanner;
public class greater_average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            float A = sc.nextFloat();
            float B = sc.nextFloat();
            int C = sc.nextInt();

            float D = (A+B)/2;

            if(D>C)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
