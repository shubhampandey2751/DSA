import java.util.*;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of n:");
        int n = sc.nextInt();
        for (int div = 2; div * div <= n; div++) { // pq=n // p>underroot n, q>underroot n, that is wrong
            while (n % div == 0) {
                n = n / div;
                System.out.print(div + " ");
            }
        }
        if (n != 1) {
            System.out.println(n);
        }
        sc.close();
    }

}
