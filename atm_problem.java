import java.util.Scanner;
public class atm_problem {
    public static void main(String[] args) {
        Scanner dev = new Scanner(System.in);
        int t = dev.nextInt();
        for(int i=0; i<t; i++){
            int n = dev.nextInt();
            int k = dev.nextInt();
            int [] arr = new int[n];
            for(int j=0; j<arr.length; j++){
                arr[j] = dev.nextInt();
            }
            int [] bin = new int[n];
            for(int j=0; j<arr.length; j++){
                int sub;
                if(arr[j]<=k){
                    bin[j] = 1;
                    k = k-arr[j];
                }
                else
                    bin[j] = 0;
            }
            for(int j=0; j<bin.length; j++){
                System.out.print(bin[j]);
            }
            System.out.println();
        }
    }
}
