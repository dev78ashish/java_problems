import java.util.Scanner;
public class kattapa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int pcount=0, ncount=0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]%2==0)
                pcount++;
            else
                ncount++;
        }

        if(pcount>ncount)
            System.out.println("READY FOR BATTLE");
        else
            System.out.println("NOT READY");

    }
}
