import java.math.BigInteger;
import java.util.Scanner;
public class bigNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        BigInteger bigSum = a.add(b);

        BigInteger bigProduct = a.multiply(b);

        System.out.println(bigSum);
        System.out.println(bigProduct);


    }
}
