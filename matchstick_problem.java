import java.util.Scanner;
public class matchstick_problem {
    public static void main(String[] args) {
        Scanner dev = new Scanner(System.in);
        int t = dev.nextInt();
        for(int i=0; i<t; i++){
            int a = dev.nextInt();
            int b = dev.nextInt();
            int z = a+b;
            int sum=0;
            while (z > 0) {
                int num = z%10;
                int count=0;
                switch (num){
                    case 1:
                        count=2;
                        break;
                    case 2:
                    case 3:
                    case 5:
                        count=5;
                        break;
                    case 4:
                        count=4;
                        break;
                    case 0:
                    case 6:
                    case 9:
                        count=6;
                        break;
                    case 7:
                        count=3;
                        break;
                    case 8:
                        count=7;
                        break;
                }
                z = z / 10;
                sum = sum + count;
            }
            System.out.println(sum);
        }
    }
}
