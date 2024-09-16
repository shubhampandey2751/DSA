import java.util.*;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int i = 0;
        while (n > 0) {
            int a = n % 10;
            n = n / 10;
            i = i * 10 + a;
        }
        System.out.println(i);

    }

}
