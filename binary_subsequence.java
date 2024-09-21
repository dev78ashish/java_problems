import java.util.Scanner;
public class binary_subsequence {
    public static void main(String[] args) {
        Scanner dev = new Scanner(System.in);
        int t = dev.nextInt();
        for(int i=0; i<t; i++){
            int n = dev.nextInt();
            int [] arr = new int[n];

           if(n%2!=0){
               for(int j=0; j<n; j++){
                   if(j%2==0)
                       arr[j] = 0;
                   else
                       arr[j] = 1;
                }
           }
           else{
               for(int j=1; j<n; j++){
                   if(j%2==0)
                       arr[j] = 0;
                   else
                       arr[j] = 1;
               }
           }

           for(int j=0; j<n; j++){
               System.out.print(arr[j]+" ");
           }
            System.out.println();
        }
    }   
}
