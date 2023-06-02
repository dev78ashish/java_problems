import java.util.Scanner;
public class order_online {
    public static void main(String[] args) {
        Scanner dev = new Scanner(System.in);
        int t = dev.nextInt();
        for(int i=0; i<t; i++){
            float n = dev.nextInt();
            int m = dev.nextInt();
            float d = n-(n/10);
            if(d==m)
                System.out.println("EITHER");
            else if (d>m)
                System.out.println("DINING");
            else
                System.out.println("ONLINE");
        }
    }
}
