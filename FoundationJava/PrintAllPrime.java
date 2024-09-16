import java.util.*;

public class PrintAllPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lowest number:");
        int low = sc.nextInt();
        System.out.print("Enter the highest number:");
        int high = sc.nextInt();
        for (int n = low; n <= high; n++) {
            int count = 0;
            // try to divde and increase count
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }
            // try to divde and increase count
            if (count == 0) {
                System.out.println(n);
            }

        }
        sc.close();
    }
}
