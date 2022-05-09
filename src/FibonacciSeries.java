import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter end term.");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series for given " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(n1 + " ");

            int nextTerm = n1 + n2;
            n1 = n2;
            n2 = nextTerm;
        }
    }
}
