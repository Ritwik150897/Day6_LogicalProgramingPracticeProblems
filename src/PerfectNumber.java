import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        long sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();

        for(int i = 1; i <= n/2; i++){
            if(n % i == 0){
                sum = sum + i;
            }
        }
        if(sum == n){
            System.out.println(n + " is a Perfect Number.");
            } else {
            System.out.println(n + " is NOT a Perfect Number.");
        }
    }
}
