import java.util.*;

public class GradimgSyatem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks > 90) {
            System.out.println("Excellent");
        } else if (marks > 80) {
            System.out.println("Best");
        } else if (marks > 70) {
            System.out.println("Better");
        } else if (marks > 60) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");

        }
    }
}
