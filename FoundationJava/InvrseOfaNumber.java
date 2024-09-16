import java.util.*;

public class InvrseOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        int inv = 0;
        int op = 1; // op is the Original Position
        while (n != 0) {
            int od = n % 10; // od is the Original Digit
            int id = op; // id is the Inverted Digit
            int ip = od; // ip is the Inverted palce

            // make chane to inv using ip and id
            inv = inv + id * (int) Math.pow(10, ip - 1);
            n = n / 10;
            op++;
        }
        System.out.println(inv);
        sc.close();
    }
}
