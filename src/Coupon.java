import java.util.Scanner;

public class Coupon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Coupons: ");
        int n = sc.nextInt();

        System.out.println(n + " Random Coupon Numbers Generated:");
        for(int i = 0; i < n; i++){
            long couponNo = (((long) Math.floor(Math.random() * 9000000000L)) + 1000000000L);
            System.out.println(couponNo);
        }
    }
}
