import java.util.*;
public class array_maximum {
    public static void main(String[] args) {
        Scanner dev = new Scanner(System.in);
        int t = dev.nextInt();
        for(int i=0; i<t; i++){
            int n = dev.nextInt();
            int [] arr = new int[n];
            for(int j=0; j< arr.length; j++) {
                arr[j] = dev.nextInt();
            }
            int max1=0, max2=0;
            for(int z=0; z< arr.length; z++){
                if(max1<arr[z]){
                    max2 = max1;
                    max1 = arr[z];
                }
                if(max2<arr[z] && arr[z]<max1){
                    max2 = arr[z];
                }
            }
            System.out.println(max1+max2);
        }
    }
}
