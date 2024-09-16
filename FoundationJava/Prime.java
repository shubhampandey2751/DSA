import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int count = 0;
            for (int div = 1; div <= n; div++) {
                // for(int div=2;div*div<=n;div++){
                if (n % div == 0) {
                    count++;
                    // break;
                    // if we break remove than execute above
                }
            }
            if (count == 2) {
                // if(count==0){
                System.out.println("Prime Number");
            } else {
                System.out.println("number is not prime");
            }
        }
        sc.close();
    }
}
