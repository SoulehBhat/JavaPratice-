import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        for (int temp = num; temp > 0; temp /= 10) {
            sum += temp % 10;
        }

        System.out.println("Sum of digits of " + num + " is: " + sum);
        sc.close();
    }
}
